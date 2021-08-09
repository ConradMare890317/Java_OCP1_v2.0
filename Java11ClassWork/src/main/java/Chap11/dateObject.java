/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
//import java.time.chrono.ThaiBuddhistDate;

/**
 *
 * @author Conrad
 */
public class dateObject {
    public static void main(String[] args) {
        LocalDateTime myDate = LocalDateTime.now();
        System.out.println("Today's date: " + myDate);
        myDate = myDate.minusMonths(9);
        myDate = myDate.plusDays(14);
        System.out.print("Minus 9 months: " + myDate);
        
        //ThaiBuddhistDate tbDate = ThaiBuddhistDate.from(myDate);
        //System.out.println("ThaiBuddhist date: " + tbDate);
        
        String sDate = myDate.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("Date in ISO_DATE_TIME format: " + sDate);
        
        String fDate = myDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("Formatted with LONG FormatStyle: " + fDate);
    }
}
