/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter1;

/**
 *
 * @author Conrad
 */
public class Example3 {
        public static void main(String[] args) {
        int v; // this declares an int variable
        double x; // this declares a floating-point variable
        
        v = 10; // assign v the value 10
        x = 10.0; // assign 10.0 to x
        
            System.out.println("Original value of v: " + v);
            System.out.println("Original value of x: " + x);
            System.out.println(); //print blank line
            
        // now, divide both by 4
        v = v / 4;
        x = x / 4;
        
            System.out.println("v after division: " + v);
            System.out.println("x after division: " + x);
    }
}
