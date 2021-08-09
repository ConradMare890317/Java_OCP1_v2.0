/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap11;

import java.util.ArrayList;
/**
 *
 * @author Conrad
 */
public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList();
        
        names.add("Jamie");
        names.add(2, "Thoni");
        
        System.out.println(names.get(1));
    }
    
}
