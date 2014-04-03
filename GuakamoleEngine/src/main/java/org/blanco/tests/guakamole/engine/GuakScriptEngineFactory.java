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

/**
 *
 * @author Alexandro Blanco <ti3r.bubblenet@gmail.com>
 */
public class GuakScriptEngineFactory implements ScriptEngineFactory {

    
    
    @Override
    public String getEngineName() {
	return "Guakamole Script Engine";
    }

    @Override
    public String getEngineVersion() {
	return "V0.01";
    }

    @Override
    public List<String> getExtensions() {
	return Arrays.asList("None");
    }

    @Override
    public List<String> getMimeTypes() {
	return Arrays.asList("text/guakamole");
    }

    @Override
    public List<String> getNames() {
	return Arrays.asList("guakamole","Guakamole","wakamole");
    }

    @Override
    public String getLanguageName() {
	return "guakamole";
    }

    @Override
    public String getLanguageVersion() {
	return "V0.01";
    }

    @Override
    public Object getParameter(String string) {
	return null;
    }

    @Override
    public String getMethodCallSyntax(String string, String string1, String... strings) {
	return null;
    }

    @Override
    public String getOutputStatement(String string) {
	return null;
    }

    @Override
    public String getProgram(String... strings) {
	return null;
    }

    @Override
    public ScriptEngine getScriptEngine() {
	ScriptEngine en = new GuakScriptEngine(this);
	return en;
    }
    
}
