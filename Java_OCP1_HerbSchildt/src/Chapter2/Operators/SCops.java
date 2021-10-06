/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter2.Operators;

/**
 *
 * @author Conrad
 */
// Demo Short-Circuit Operators
public class SCops {
    public static void main(String[] args) {
        int n, d, q;
        
        n = 10;
        d = 2;
        if(d != 0 && (n %d) == 0)
            System.out.println(d + " is a factor of " + n);
        
        d = 0; // now, set d to zero
        
        // Since d is zero, the second operand is not evaluated.
        if(d != 0 && (n % d) == 0)
            System.out.println(d + " is a factor of " + n);
        
        /* Now, try the same thing without S-C end operator.
        This will cause a divide by zero error.
        */
        if(d != 0 & (n % d) == 0)
            System.out.println(d + " is a factor of " + n);
    }
    
}
