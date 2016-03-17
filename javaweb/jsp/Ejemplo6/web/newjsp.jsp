<%-- 
    Document   : newjsp
    Created on : 11/03/2016, 11:42:22 AM
    Author     : hernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            for(int i =0; i<=100;i++){
            out.print(i);
            }
        
        %>
    </body>
</html>
