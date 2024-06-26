/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.bl.EmployeeFacadeLocal;

/**
 *
 * @author Student
 */
public class NumFemaleServlet extends HttpServlet {

   
     @EJB EmployeeFacadeLocal el;
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        
        Integer cnt=el.cntNumOfFemale();
        request.setAttribute("cnt", cnt);
        
        RequestDispatcher disp=request.getRequestDispatcher("female_outcome.jsp");
        disp.forward(request, response);
    }

 
}
