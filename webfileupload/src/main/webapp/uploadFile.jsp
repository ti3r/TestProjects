<%-- 
    Document   : uploadFile
    Created on : Nov 29, 2013, 12:31:48 PM
    Author     : Alexandro Blanco <ti3r.bubblenet@gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>JSP Page</title>
        </head>
        <body>
            <h1>Hello World!</h1>
	    <form action="uploadFile" method="post" enctype="multipart/form-data" name="fileForm">
		<input  id="file" name="file" type="file" value="fileToUpload" />
		<input type="submit"/>
	    </form>
        </body>
    </html>