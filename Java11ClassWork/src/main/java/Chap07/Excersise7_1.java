/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap07;

/**
 *
 * @author Conrad
 */
public class Excersise7_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Customer customer1 = new Customer("Cuck Barry", 123, "Oregon", 255, 60);
        Customer customer2 = new Customer("Dick Richards", 420, "California", 205, 67);
        Customer customer3 = new Customer("Jon Dohe", 103, "Sector7", 775, 50);
        Customer customer4 = new Customer("Johnny Sins", 212, "Essex", 855, 99);
        
        Customer[] customers = {customer1, customer2, customer3, customer4};
        
        for (Customer customer : customers) {
            System.out.println(customer.displayCustomer());
        }
    }
}
