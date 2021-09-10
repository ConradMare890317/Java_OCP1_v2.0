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
// Demo Block Scope
public class ScopeDemo {
    public static void main(String[] args) {
        int x; //know to all code within main
        
        x = 10;
        if(x == 10) { //start new scope
            
            int y = 20; //know only to this block
            
            //x and y both know here.
            
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        //y = 100; // Error: y not know here
        
        //x is still known here.
        System.out.println("x is " + x);
    }
}
