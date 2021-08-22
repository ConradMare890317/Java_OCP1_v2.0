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
public class Employees {
    private String firstName;
    private String lastName;
    private int empID;
    private String department;
    private double salary;
    
    public Employees(String firstName, String lastName, int empID, String department, double salary) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.empID = empID;
    this.department = department;
    this.salary = salary;
     
}
  public void display() {
      System.out.println("First Name " + getFirstName());
      System.out.println("Last Name " + getLastName());
      System.out.println("Employee ID " + getEmployeeID());
      System.out.println("Department " + getDepartment());
      System.out.println("Salary " + getSalary());
  }
    
    public String Employees(){
        return "Employee: " + firstName + "\n" +
               "Employee ID: " + empID + "\n" +
               "Address: " + address + "\n" +
               "Order Number: " + orderNum + "\n" +
               "Age: " + age;
}
