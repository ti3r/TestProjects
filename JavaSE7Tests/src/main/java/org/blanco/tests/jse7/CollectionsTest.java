/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.blanco.tests.jse7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Alexandro Blanco <ti3r.bubblenet@gmail.com>
 */
public class CollectionsTest {
    
    public static void main(String[] args){
	//Diamon operator
	List<Circle> circles = new ArrayList<>();
	for (int i=1; i <=10; ++i){
	    Circle c = new Circle(i);
	    c.setId(i);
	    circles.add(c);
	}
	System.out.println("Circles "+circles);
	
	//Covariant returns
	List<? super Shape> shapes = new LinkedList<>();
	//init 5 circles and 5 squares
	for(int i=1; i <= 5; i++){
	    Object[] ar = new Object[]{new Long(""+i), new Double(i * 1.0)};
	    shapes.add(new Circle().initShape(ar));
	}
	for(int i=1; i <=5 ; i++){
	    Object[] ar = new Object[]{new Long(""+i), new Integer(i)};
	    shapes.add(new Square().initShape(ar));
	}
	
	System.out.println("Shapes "+shapes);
    }
    
}
