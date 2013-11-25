package org.blanco.tests.jse7;

import java.util.Scanner;

/**
 *
 * @author Alexandro Blanco <ti3r.bubblenet@gmail.com>
 */
public class StringSwitch {
    
    public static void main(String[] args){
	System.out.println("Select One of the options: Hi, Hola....");
	System.out.print(">> ");
	Scanner scanner = new Scanner(System.in);
	String word = scanner.nextLine();
	switch(word){
	    case "Hi":
		System.out.println("Hello World!!!!");
		break;
	    case "Hola":
		System.out.println("Hola Mundo!!!!");
		break;
	    default:
		System.out.println("Word not recognized");
		System.out.println(word);
	}
	
    }
    
}
