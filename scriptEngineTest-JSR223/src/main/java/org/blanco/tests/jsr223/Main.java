/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.blanco.tests.jsr223;

import java.util.List;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * List the scripting engines supported by the project
 * (javascript is supported by default in the jdk).
 * [Tip: Run this with java 1.7 javascript engine is Rhino 
 * , run this in java 1.8 javascript engine is new Nashorn]
 * @author Alexandro Blanco <ti3r.bubblenet@gmail.com>
 */
public class Main {

    public static void main(String[] args) throws ScriptException {
	ScriptEngineManager factory = new ScriptEngineManager();
	
	List<ScriptEngineFactory> factories = factory.getEngineFactories();
	for(ScriptEngineFactory fac : factories){
	    System.out.println("Engine name: " + fac.getEngineName());
	    System.out.println("---Mime types: "+ fac.getMimeTypes());
	    System.out.println("---Language name: "+fac.getLanguageName());
	    System.out.println("---Engine Version: "+fac.getEngineVersion());
	}
	
    }

}
