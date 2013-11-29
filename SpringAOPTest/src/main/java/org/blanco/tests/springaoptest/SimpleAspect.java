/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.blanco.tests.springaoptest;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Simple aspect class for testing purposes
 * @author Alexandro Blanco <ti3r.bubblenet@gmail.com>
 */
@Aspect
public class SimpleAspect {
    
    @Pointcut("execution(* org.blanco.tests.springaoptest.sayHi(..)")
    public void sayHi(){
	System.out.println("Hello World!!!!");
    }
    @Pointcut("execution(* org.blanco.test.springaoptest.SimpleAspect.*")
    public void transaction3Steps(){
	step1();
	step2();
	step3();
    }
    
    @AfterReturning("org.blanco.test.springaoptest.SimpleAspect.transaction3Steps()")
    public void afterTransaction(){
	System.out.println("Transaction 3 steps endded");
    }
    
    public void step1(){
	System.out.println("Step 1");
    }
    
    
    public void step2(){
	System.out.println("Step 2");
    }
    
    
    public void step3(){
	System.out.println("Step 3");
    }
    
}
