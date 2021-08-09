/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap13;

/**
 *
 * @author Conrad
 */
public class Trousers extends Clothing {
    private char fit;
    private double waist;
    private char gender;

    public Trousers(int itemID, String desc, char colorCode, double price, char fit, double waist, char gender) {
        super(itemID, desc, colorCode, price);
        this.fit = fit;
        this.waist = waist;
        this.gender = gender;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Fit: " + getFit());
        System.out.println("Waist Size: " + getWaist());
        System.out.println("Gender: " + getGender());
        System.out.println("\n");
    }

    public char getFit() {
        return fit;
    }

    public void setFit(char fit) {
        this.fit = fit;
    }

    public double getWaist() {
        return waist;
    }

    public void setWaist(double waist) {
        this.waist = waist;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    } 
}