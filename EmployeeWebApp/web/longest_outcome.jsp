<%-- 
    Document   : longest_outcome
    Created on : 15 May 2024, 5:15:00 PM
    Author     : Student
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@page import="za.ac.tut.model.entities.Employee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>longest service page</title>
    </head>
    <body>
        <h1>Longest Service Employee Details</h1>
         <%
             List<Employee> emp=( List<Employee>)request.getAttribute("emp");
             
            %>
            <table>
                <%
                
                for(Employee e:emp)
                {
                  String name=e.getName();
                  Integer age=e.getAge();
                  String gender=e.getGender().toString();
                  Date hire=e.getHireDate();
                  SimpleDateFormat dt=new SimpleDateFormat("yyyy-mm-dd");
                 String simp=dt.format(hire);
                  
                
                %>
                
                <tr>
                    <td>Name :<%=name%></td>
                </tr>
                 <tr>
                    <td>Age :<%=age%></td>
                </tr>
                 <tr>
                    <td>Gender :<%=gender%></td>
                </tr>
                 <tr>
                    <td>Date OF Placement  :<%=simp%></td>
                </tr>
                <%
                }
                
                %>
            </table>
             <p>click <a href="menu.html">here</a> to go back to the menu page or <a href="index.html">here </a>to access home page</p>
    </body>
</html>
