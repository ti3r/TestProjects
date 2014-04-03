/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.blanco.tests.java8;

import static java.lang.System.out;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
/**
 *
 * @author Alexandro Blanco <ti3r.bubblenet@gmail.com>
 */
public class Lambda {
    
    static Comparator<String> sortAssenging = ( n1, n2) -> {
	return n1.compareTo(n2);
    };
    
    static Comparator<String> sortDesending = (n1, n2) -> {
	return n2.compareTo(n1);
    };
    
    
    public static void main(String[] args){
	
	List<String> names = Arrays.asList("carlos","alex","luis","samuel");
	out.println(names);
	//Inline lambda function
	names.sort((n1, n2) ->{
	    return n1.compareTo(n2);
	});
	
	out.println(names);
	//Create a thread with inline lambada expression no parameter
	Thread t = new Thread(()->{
	    out.println("Hello from Thread "+Thread.currentThread().getName());
	}, "ThreadAlex-1");
	t.start();
	
	//Pass a lamba expression declared as a property
	names.sort(sortDesending);
	out.println(names);
	
	names.forEach(n -> out.println("-"+n));
	//Calling functions with the new operator ::
	names.replaceAll(String::toUpperCase);
	out.println("names after upercase"+names);
	
    }
    
}
