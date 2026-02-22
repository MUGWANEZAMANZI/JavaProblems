package com.studentassignone.studentassignone;
import java.util.Scanner;

public class CheckVowelOrConsonant {
    
    
    public static String check(char a){
        char vowels[] = {'a','e','i','u','o'};
        for( char i : vowels){
            if( i == a) return "Vowel";
        }
        return "Consonant";
    }
    
    public static void main(String[] arhs){
        Scanner s = new Scanner(System.in);
        if (s.hasNextInt()) {
            System.out.println("Not a character");
        }else{
            char a =  s.next().charAt(0);
            System.out.println(check(a));
        }    
    }
    
    }
    
