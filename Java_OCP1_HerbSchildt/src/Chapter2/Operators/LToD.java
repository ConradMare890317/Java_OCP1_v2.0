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
// Demo automatic conversion from Long to Double
public class LToD {
    public static void main(String[] args) {
        long L;
        double D;
        
        L = 100123285L;
        D = L; // Auto conversion from long to double
        
        System.out.println("L and D: " + L + " " + D);
    }
}

/* This will not compile:
public class LToD {
    public static void main(String[] args) {
        long L;
        double D;
        
        D = 100123285.0;
        L = D; // Illegal!!
        
        System.out.println("L and D: " + L + " " + D);
    }
}

char and boolean aren't compatible, int literal can be assigned to char...
*/
