
package com.studentassignone.studentassignone;
import java.util.Scanner;

public class SimpleNumber {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("enter a number: ");
        int a = s.nextInt();
        System.out.print("Enter another number: ");
        int b = s.nextInt();
        int c = a+b;
        System.out.println("The sum of entered numbers are: " + c);
    }
}
