/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapp;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Wayne Thomas sandbox code provided by https://www.youtube.com/watch?v=KkaQYLNTFek
 */
public class Testapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*String employeeName = "Bob";
        String employeeLocation = "Salt Lake City, Utah";
        double employeeSalary = 110000;
        if(DatabaseAccessObject.addEmployee(employeeName, employeeLocation, employeeSalary, new Date())){
            System.out.println("Employee Added Successfully");
        }else{
            System.out.println("Fatal Error Occured");
        }*/
        
        int empId = 2;
        List<Employees> emps = DatabaseAccessObject.getEmpDetails(empId);
        for(Employees emp: emps){
            System.out.println(emp.getEmployeeLocation());            
        }      
               
    }
    
}
