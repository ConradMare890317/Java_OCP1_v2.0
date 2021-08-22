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
public class HR extends Employees {
    private String role;
    private String responsibility;
    
    public HR (String firstName, String lastName, int empID, String department, double salary, String role, String responsibility){
        super(firstName, lastName, empID, department, salary);
        this.role = role;
        this.responsibility = responsibility;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Role: " + getRole());
        System.out.println("Responsibility: " + getResponsibility());
    }
    
    public String getRole() {
        return role;
    }
    
    public void setRole() {
        this.role = role;
    }
    
    public String getResponsibility() {
        return responsibility;
    }
    
}
