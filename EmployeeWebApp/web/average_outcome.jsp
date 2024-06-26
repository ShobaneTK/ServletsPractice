<%-- 
    Document   : average_outcome
    Created on : 15 May 2024, 4:57:21 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>average Page</title>
    </head>
    <body>
        <h1>Average Details</h1>
        <%
            double cnt=(Double)request.getAttribute("average");
            %>
            <p>the number of Female employees is : <%=cnt%> %</p>
        
        
        
        <p>click <a href="menu.html">here</a> to go back to the menu page or <a href="index.html">here </a>to access home page</p>
    </body>
</html>
