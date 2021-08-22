/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employees_Exercise;

/**
 *
 * @author Conrad
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HR emp01 = new HR("Jane","Doe", 255, "Human Resources", 425000.0, "HR Manager", "Oversee HR staff");
        emp01.display();
        emp01.setEmpID(256);
        System.out.println("..........\n");
        emp01.display();
    }
    
}
