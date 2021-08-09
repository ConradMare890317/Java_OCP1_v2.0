/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap12;

/**
 *
 * @author Conrad
 */
public class Socks extends Material {
    private double price;
    
    Material sock01 = new Socks();
    
    String happySock = ((Material)sock01).getMaterialType1();
    
    @Override
    public double getPrice(){
        return price;
    }

    @Override
    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
