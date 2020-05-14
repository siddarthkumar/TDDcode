package dojo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author siddarth
 */
public class Dojo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
    System.out.println(Dojo.check("1700"));
    }
    public static String check(String input)
    {
         double year = Double.parseDouble(input);
     if(year%100==0 && year%400==0){
         return "Leap Year";
     }else if(year%100==0 && year%4==0){
    return "Not a Leap Year";
     }
     else if(year%4==0 && year%100!=0){
     return "Leap Year";
     }
      else{
         return "Not a Leap Year";
            }
    }
    
}
