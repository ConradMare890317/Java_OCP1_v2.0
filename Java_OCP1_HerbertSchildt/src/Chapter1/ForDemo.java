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
public class ForDemo {
    public static void main(String[] args) {
        int count;
        
        for(count = 0; count < 5; count = count+1) //This loop iterates 5 times
            System.out.println("This is count: " + count);
            
            System.out.println("Done!");
    }
}


/*
Note!
Professional Java program:
    " for(count = 0; count < 5; count = count+1) " written as:
    ' for(count = 0; count < 5; count++) ';

!!!! INCREMENT OPERATOR = ++
*/