/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model.bl;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.model.entities.Employee;

/**
 *
 * @author Student
 */
@Stateless
public class EmployeeFacade extends AbstractFacade<Employee> implements EmployeeFacadeLocal {

    @PersistenceContext(unitName = "EmployeeEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmployeeFacade() {
        super(Employee.class);
    }

    @Override
    public Integer cntNumOfFemale() {
       
        Query query=em.createQuery("SELECT COUNT(e) FROM Employee e WHERE e.gender='F' ");
        Long cnt=(Long)query.getSingleResult();
        return cnt.intValue();
    }

    @Override
    public Integer cntNumOfMale() {
        Query query=em.createQuery("SELECT COUNT(e) FROM Employee e WHERE e.gender='M' ");
        Long cnt=(Long)query.getSingleResult();
        return cnt.intValue();
    }

    @Override
    public List<Employee> youngest() {
          Query query=em.createQuery("SELECT e FROM Employee e WHERE e.age=(SELECT MIN(e.age) FROM Employee e ) ");
        List<Employee> emp=  query.getResultList();
        
        return emp;
    }

    @Override
    public Double averag() {
         Query query=em.createQuery("SELECT AVG(e.age) FROM Employee e");
         Double avera=(Double)query.getSingleResult();
         return avera;
    }

    @Override
    public List<Employee> longest() {
       
         Query query=em.createQuery("SELECT e FROM Employee e WHERE e.hireDate=(SELECT MIN(e.hireDate) FROM Employee e ) ");
           List<Employee> emp=  query.getResultList();
           return emp;
    }
    
    
    
    
    
    
    
    
}
