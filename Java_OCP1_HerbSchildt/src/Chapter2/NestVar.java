/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter2;

/**
 *
 * @author Conrad
 */
/*
This program attempts to declare a variable in an
inner scope with the same name as one defined in an
outer scope.

***This will not compile.***
*/
/*public class NestVar {
    public static void main(String[] args) {
        int count; // can't declare again
        
        for(count = 0; count < 10; count = count+1) {
            System.out.println("This is count: " + count);
            
            int count; // same as ln 21( illegal )
            for(count = 0; count < 2; count++)
                System.out.println("This program is an ERROR!");
        }
    }
}*/
