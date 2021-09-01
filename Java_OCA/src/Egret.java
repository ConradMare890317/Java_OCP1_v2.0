/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Conrad
 */

/*
Java_OCA book.
Question12 - page38.
*/
public class Egret {
    private String color;
    public Egret() {
        this("white");
    }
    
    public Egret(String color) {
        this.color = color;
    }
 
    public static void main(String[] args) {
        Egret e = new Egret();
        System.out.println("Color:" + e.color);
    }
 }
 
