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
// Demo dynamic initialization:
public class DynInit {
    public static void main(String[] args) {
        double radius = 4, height = 5;
        
        // dynamically initialize volume
        double volume = 3.1416 * radius * height;
        
        System.out.println("Volume is " + volume);
    }
}