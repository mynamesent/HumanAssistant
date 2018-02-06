<%-- 
    Document   : index
    Created on : 10-Dec-2017, 16:04:40
    Author     : Patiz
--%>

<%@page import="Model.HelloWorld"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            HelloWorld h = new HelloWorld();
            String word =(String) request.getAttribute("word");
            String data = h.getData();
        %>
        <h1><%= data%></h1>
        <h1><%= word%></h1>
        
        <!--<h1></h1>-->
       <!--test-->
    </body>
</html>
