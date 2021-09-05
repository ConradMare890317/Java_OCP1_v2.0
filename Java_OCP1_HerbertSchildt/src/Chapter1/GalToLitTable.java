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
public class GalToLitTable {
    public static void main(String[] args) {
        double gallons, liters;
        int counter;
        
        counter = 0; //Line counter is initially set to zero
        for(gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854; // convert to liters
            System.out.println(gallons + " gallons is " + liters + " liters.");
            
            counter++; // Increment the line counter with each loop iteration
            // every 10th line, print blank line
            if(counter == 10) { // if counter is 10, print blank.
                System.out.println();
                counter = 0; // reset line counter
            }
        }
    }
}
