/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.blanco.tests.guakamole.engine;

import java.util.Arrays;
import java.util.List;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author asantana
 */
public class GuakScriptEngineFactoryTest {
    
    ScriptEngineManager manager;
    
    public GuakScriptEngineFactoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
	manager = new ScriptEngineManager();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testEngineDiscovery(){
	
	List<ScriptEngineFactory> factories = manager.getEngineFactories();
	StringBuilder eginesNames = new StringBuilder();
	for(ScriptEngineFactory factory : factories){
	    System.out.println(factory.getEngineName());
	    eginesNames.append(factory.getEngineName());
	}
	assertTrue("Engines disponibles deben de contener a guacamole",
		eginesNames.indexOf("Guakamole") >= 0);
    }
    
    @Test
    public void testObtenerEnginePorMimeType(){
	Object en = manager.getEngineByName("guakamole");
	assertNotNull("objeto engine no debe de ser nulo", en);
    }
    
//    /**
//     * Test of getEngineName method, of class GuakScriptEngineFactory.
//     */
//    @Test
//    public void testGetEngineName() {
//	System.out.println("getEngineName");
//	GuakScriptEngineFactory instance = new GuakScriptEngineFactory();
//	String expResult = "";
//	String result = instance.getEngineName();
//	assertEquals(expResult, result);
//	// TODO review the generated test code and remove the default call to fail.
//	fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getEngineVersion method, of class GuakScriptEngineFactory.
//     */
//    @Test
//    public void testGetEngineVersion() {
//	System.out.println("getEngineVersion");
//	GuakScriptEngineFactory instance = new GuakScriptEngineFactory();
//	String expResult = "";
//	String result = instance.getEngineVersion();
//	assertEquals(expResult, result);
//	// TODO review the generated test code and remove the default call to fail.
//	fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getExtensions method, of class GuakScriptEngineFactory.
//     */
//    @Test
//    public void testGetExtensions() {
//	System.out.println("getExtensions");
//	GuakScriptEngineFactory instance = new GuakScriptEngineFactory();
//	List<String> expResult = null;
//	List<String> result = instance.getExtensions();
//	assertEquals(expResult, result);
//	// TODO review the generated test code and remove the default call to fail.
//	fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getMimeTypes method, of class GuakScriptEngineFactory.
//     */
//    @Test
//    public void testGetMimeTypes() {
//	System.out.println("getMimeTypes");
//	GuakScriptEngineFactory instance = new GuakScriptEngineFactory();
//	List<String> expResult = null;
//	List<String> result = instance.getMimeTypes();
//	assertEquals(expResult, result);
//	// TODO review the generated test code and remove the default call to fail.
//	fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getNames method, of class GuakScriptEngineFactory.
//     */
//    @Test
//    public void testGetNames() {
//	System.out.println("getNames");
//	GuakScriptEngineFactory instance = new GuakScriptEngineFactory();
//	List<String> expResult = Arrays.asList("guakamole");
//	List<String> result = instance.getNames();
//	assertEquals(expResult, result);
//	// TODO review the generated test code and remove the default call to fail.
//	fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getLanguageName method, of class GuakScriptEngineFactory.
//     */
//    @Test
//    public void testGetLanguageName() {
//	System.out.println("getLanguageName");
//	GuakScriptEngineFactory instance = new GuakScriptEngineFactory();
//	String expResult = "";
//	String result = instance.getLanguageName();
//	assertEquals(expResult, result);
//	// TODO review the generated test code and remove the default call to fail.
//	fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getLanguageVersion method, of class GuakScriptEngineFactory.
//     */
//    @Test
//    public void testGetLanguageVersion() {
//	System.out.println("getLanguageVersion");
//	GuakScriptEngineFactory instance = new GuakScriptEngineFactory();
//	String expResult = "";
//	String result = instance.getLanguageVersion();
//	assertEquals(expResult, result);
//	// TODO review the generated test code and remove the default call to fail.
//	fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getParameter method, of class GuakScriptEngineFactory.
//     */
//    @Test
//    public void testGetParameter() {
//	System.out.println("getParameter");
//	String string = "";
//	GuakScriptEngineFactory instance = new GuakScriptEngineFactory();
//	Object expResult = null;
//	Object result = instance.getParameter(string);
//	assertEquals(expResult, result);
//	// TODO review the generated test code and remove the default call to fail.
//	fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getMethodCallSyntax method, of class GuakScriptEngineFactory.
//     */
//    @Test
//    public void testGetMethodCallSyntax() {
//	System.out.println("getMethodCallSyntax");
//	String string = "";
//	String string1 = "";
//	String[] strings = null;
//	GuakScriptEngineFactory instance = new GuakScriptEngineFactory();
//	String expResult = "";
//	String result = instance.getMethodCallSyntax(string, string1, strings);
//	assertEquals(expResult, result);
//	// TODO review the generated test code and remove the default call to fail.
//	fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getOutputStatement method, of class GuakScriptEngineFactory.
//     */
//    @Test
//    public void testGetOutputStatement() {
//	System.out.println("getOutputStatement");
//	String string = "";
//	GuakScriptEngineFactory instance = new GuakScriptEngineFactory();
//	String expResult = "";
//	String result = instance.getOutputStatement(string);
//	assertEquals(expResult, result);
//	// TODO review the generated test code and remove the default call to fail.
//	fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getProgram method, of class GuakScriptEngineFactory.
//     */
//    @Test
//    public void testGetProgram() {
//	System.out.println("getProgram");
//	String[] strings = null;
//	GuakScriptEngineFactory instance = new GuakScriptEngineFactory();
//	String expResult = "";
//	String result = instance.getProgram(strings);
//	assertEquals(expResult, result);
//	// TODO review the generated test code and remove the default call to fail.
//	fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getScriptEngine method, of class GuakScriptEngineFactory.
//     */
//    @Test
//    public void testGetScriptEngine() {
//	System.out.println("getScriptEngine");
//	GuakScriptEngineFactory instance = new GuakScriptEngineFactory();
//	ScriptEngine expResult = null;
//	ScriptEngine result = instance.getScriptEngine();
//	assertEquals(expResult, result);
//	// TODO review the generated test code and remove the default call to fail.
//	fail("The test case is a prototype.");
//    }
//    
}
