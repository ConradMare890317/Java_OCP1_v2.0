/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Conrad
 */
public class Lists {
    public static void main(String[] args) {
        String[] names = {"Jaime", "Jamyee", "Sheldon", "Hannah", "Jaden"};
        List<String> myList = new ArrayList(Arrays.asList(names));
        
//        for(String s : myList){
//            System.out.println(s.toUpperCase() + ",");
//        }
//        
//        myList.replaceAll(s -> s.toUpperCase());
        
//        myList.removeIf(s -> s.equals("Jaymee"));
        myList.removeIf(s -> s.length() < 6);
        
        System.out.println("\n");
        
        System.out.println("After loop: " + myList);
    }
}