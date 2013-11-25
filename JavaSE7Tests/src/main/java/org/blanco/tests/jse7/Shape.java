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
public abstract class Shape {
    
    private long id;
   
    public long getId() {
	return id;
    }

    public void setId(long id) {
	this.id = id;
    }
    
    public abstract Shape initShape(Object... properties);    
}
