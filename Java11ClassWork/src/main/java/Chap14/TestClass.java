/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap14;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Conrad
 */
public class TestClass {
    
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        
        try{
            testClass.testCheckedException();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void testCheckedException() throws IOException{
        File testFile = new File("//testFile.txt");
        testFile.createNewFile();
        System.out.println("testFile exists: " + testFile.exists());
    }
}