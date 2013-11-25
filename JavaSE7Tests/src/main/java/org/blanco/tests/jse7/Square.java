/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.blanco.tests.jse7;

/**
 *
 * @author Alexandro Blanco <ti3r.bubblenet@gmail.com>
 */
public class Square extends Shape{

    private Number size;
    
    //Covariant Returns
    @Override
    public Square initShape(Object... properties) {
	if (properties.length != 2 || !(properties[0] instanceof Long) || !(properties[1] instanceof Number))
	    throw new IllegalArgumentException("Unable to build Square Shape. "
		    + "2 number must be passed in the properties (Long) id & (Number) size");
	
	this.setId((long) properties[0]);
	this.size = ((Number) properties[1]);
	return this;
    }

    @Override
    public String toString() {
	return "Square{" + "size=" + size + '}';
    }
    
    public Number getSize() {
	return size;
    }

    public void setSize(Number size) {
	this.size = size;
    }
    
    
}
