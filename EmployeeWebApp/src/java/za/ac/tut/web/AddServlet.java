/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.bl.EmployeeFacadeLocal;
import za.ac.tut.model.entities.Employee;

/**
 *
 * @author Student
 */
public class AddServlet extends HttpServlet {

   @EJB EmployeeFacadeLocal el;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
       try {
           String name=request.getParameter("name");
           Integer age=Integer.parseInt(request.getParameter("age"));
           Character gender=request.getParameter("gender").charAt(0);
           SimpleDateFormat dt=new SimpleDateFormat("yyyy-mm-dd");
           String hire=request.getParameter("hire");
           
           Date hireDate=dt.parse(hire);
           Employee emp=new Employee(name, age, gender, hireDate);
           el.create(emp);
           RequestDispatcher disp=request.getRequestDispatcher("add_outcome.jsp");
           disp.forward(request, response);
       } catch (ParseException ex) {
           Logger.getLogger(AddServlet.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        
    }

    
}
