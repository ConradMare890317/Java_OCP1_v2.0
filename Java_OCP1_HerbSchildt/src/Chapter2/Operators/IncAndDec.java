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
public class IncAndDec {
    public static void main(String[] args) {
      /*  x = x + 1;
        //same as:
        x++;
        
        //and 
        x = x -1;
        //same as:
        x--;
        
        //postfix form:
        x++;
        //prefix form:
        ++x;
        */
        int x = 10;
        int y = x++;
        
        System.out.println(x);
        System.out.println(y);
    }
}
