package com.studentassignone.studentassignone;
import java.util.Scanner;



public class ConvertCharToStringAndStringToChar {
    
    public static String Display(String a){
        char[] c = new char[100];
        String str = "m";
        String ans;
        
            if(a.length() > 1){
                for(int i = 0; i < a.length(); i++){
                    c[i] = a.charAt(i);
                }
            }else{
                str = a;
            }
            if (a.length() > 1){
                ans = (c.getClass().getSimpleName());
            }else{
                ans = (str.getClass().getSimpleName());
            }  
            return ans;
    }
   
    public static void main(String[] args){
        while (1 == 1){
        System.out.println("If you enter a character it is converted to string");
        System.out.println("IF you enter a string is comnverted to an array of characters");
        System.out.println("Enter a . to quit");
        Scanner s = new Scanner(System.in);
        String a = s.next();
        System.out.println("Converted to: " + Display(a));
        System.out.println("");
        System.out.println("");
        
        if (a.charAt(0) == '.') return;
        }
    }
}
