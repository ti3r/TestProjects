/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.blanco.tests.webfileupload;

import java.io.IOException;
import java.util.Collection;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Alexandro Blanco <ti3r.bubblenet@gmail.com>
 */
@WebServlet(urlPatterns = {"/uploadFile"})
@MultipartConfig()
public class HelloServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.getWriter().append("<h1>Hello World!!!!</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType(MediaType.TEXT_HTML);
	Collection<Part> parts = req.getParts();
	resp.getWriter().append("Parts size detected: "+parts.size()+" <br />");
	int x=1;
	for (Part part: parts){
	    resp.getWriter().append(String.format(
		    "Part #%s's name: %s, with size %d KB",x++,part.getName(),part.getSize()));
	    resp.getWriter().append("<br />");
	}
    }
 
    
    
}
