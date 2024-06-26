/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
public class AverageServlet extends HttpServlet {

      @EJB EmployeeFacadeLocal el;
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        
        double average=el.averag();
        request.setAttribute("average", average);
        
        RequestDispatcher disp=request.getRequestDispatcher("average_outcome.jsp");
        disp.forward(request, response);
    }

}
