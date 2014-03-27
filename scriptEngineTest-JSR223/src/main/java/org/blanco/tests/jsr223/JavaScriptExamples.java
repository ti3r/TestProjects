/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.blanco.tests.jsr223;

import java.util.Map;
import java.util.TreeMap;
import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.SimpleBindings;

/**
 *
 * @author Alexandro Blanco <ti3r.bubblenet@gmail.com>
 */
public class JavaScriptExamples {
    
    public static void main(String[] args) throws ScriptException{
	ScriptEngine engine = 
	new ScriptEngineManager().getEngineByMimeType("text/javascript");
	//Print a message
	engine.eval("println('Hola mundo!!!')");
	
	//Passing arguments
	Map<String, Object> vars = new TreeMap<String, Object>(){
	    {
		put("nombre", "Alex");
	    }
	};
	Bindings bindings = new SimpleBindings(vars);
	engine.eval("println('Hola '+ nombre )", bindings);
	
	//Returning values from engine
	engine.eval("var alex = 'Alexandro Blanco'");
	String varAlex = (String) engine.get("alex");
	System.out.println("Var returned from engine script: "+varAlex);
    }
    
}
