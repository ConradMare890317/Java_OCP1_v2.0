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
public class Customer {
    public String name;
    public int custID;
    public String address;
    public int orderNum;
    public int age;

    public Customer(String name, int custID, String address, int orderNum, int age) {
        this.name = name;
        this.custID = custID;
        this.address = address;
        this.orderNum = orderNum;
        this.age = age;
    }

    
     public String displayCustomer(){
        return "Customer: " + name + "\n" +
               "Customer ID: " + custID + "\n" +
               "Address: " + address + "\n" +
               "Order Number: " + orderNum + "\n" +
               "Age: " + age;
    }
}
