/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap10;

/**
 *
 * @author Conrad
 */
public class Employees2 {
    public String name1 = "Fred Smith";
    public String name2 = "fred Smith";
    
    public void areNamesEqual() {
        if (name1.equals(name2)) {
            System.out.println("Same name.");
        }
        else {
            System.out.println("Different name.");
        }
    }
    
    public void areNamesEqual2() {
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Same name.");
        }
        else {
            System.out.println("Different name.");
        }
    }
    
    public static void main(String[] args) {
        Employees2 emp1 = new Employees2();
        
        emp1.areNamesEqual();
        emp1.areNamesEqual2();
    }
}