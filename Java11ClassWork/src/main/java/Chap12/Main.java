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
public class Main {
    public static void main(String[] args) {
        Shirt shirt01 = new Shirt(15, "Hawaiain", 'R', 55.9, 'M', "Short sleeve");

        shirt01.display();

        Pants pants01 = new Pants(18, "Formal", 'G', 45.99, 'M', 36.6, 'F');

        pants01.display();
        
        Clothing shirt02 = new Shirt(34, "Golf", 'B', 35.99, 'L', "Short sleeve");

        if (shirt02 instanceof Shirt) {
            char shirtfit = (((Shirt)shirt02).getFit());
            System.out.println("Golf Shirt fit: " + shirtfit);

            System.out.println("Golf Shirt fit: " + ((Shirt)shirt02).getFit());
        } else {
            System.out.println("Item is not a shirt.");
        }

        System.out.println("\n");

        shirt02.display();
        System.out.println("\n");
        System.out.println("Item ID: " + shirt02.getItemID());
        System.out.println("\n");
        System.out.println("Shirt Sleeve: " + ((Shirt)shirt02).getSleeve());

          System.out.println(shirt02.toString());
    }
}