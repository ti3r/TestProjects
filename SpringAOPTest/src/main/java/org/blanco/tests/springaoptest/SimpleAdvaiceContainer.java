package org.blanco.tests.springaoptest;

import org.aspectj.lang.annotation.Before;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asantana
 */
public class SimpleAdvaiceContainer {
    
    @Before("org.blanco.tests.springaoptest.SimpleAspect.transaction3Steps()")
    public void beforeAdviceMethod(){
	System.out.println("Before Pointcut advice executed");
    }
}
