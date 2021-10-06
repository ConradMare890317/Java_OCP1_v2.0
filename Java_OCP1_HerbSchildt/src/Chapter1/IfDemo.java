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
public class IfDemo {
    public static void main(String[] args) {
        int a, b, c;
        
        a = 2;
        b = 3;
        a = b;
        
        if(a < b) System.out.println("a is less than b");
        
        // this won't display anything
        if(a == b) System.out.println("you won't see this");
        
        System.out.println();
        
        c = a - b; // c contains -1
    }
    
}
