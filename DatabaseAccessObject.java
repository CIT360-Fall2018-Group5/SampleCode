/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapp;

import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 *  @author Wayne Thomas sandbox code provided by https://www.youtube.com/watch?v=KkaQYLNTFek
 */
public class DatabaseAccessObject {
    
    public static boolean addEmployee(String employeeName, String employeeLocation, double employeeSalary, Date rcreTime){
        int empId = 0;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
            try{
                 tx = session.beginTransaction();
                 Employees emp = new Employees(employeeName, employeeLocation, employeeSalary, rcreTime);
                 empId = (Integer)session.save(emp);
                 tx.commit();
            }catch(Exception asd){
                System.out.println(asd.getMessage());
                if (tx != null){
                    tx.rollback();
                }
            }finally {
                session.close();
            }
            
            return empId > 0;
    }
    public static List<Employees> getEmpDetails(int empId){
        List<Employees> employees = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try{
              tx = session.beginTransaction();
                 Criteria cr = session.createCriteria(Employees.class);
                 cr.add(Restrictions.eq("employeeId", empId));
                 employees = cr.list();
                 tx.commit();   
            }catch(Exception asd){
                System.out.println(asd.getMessage());
                if (tx != null){
                    tx.rollback();
                }
            }finally {
                session.close();
            }
        
        return employees;    
    }
    
}
