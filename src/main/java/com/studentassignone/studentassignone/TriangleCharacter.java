package com.studentassignone.studentassignone;
import java.util.Scanner;

public class TriangleCharacter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        
        for (int i = 0; i < N; i++){
            for (int k = 0; k < i+1; k++){
                System.out.print("A");
            }
            System.out.println("");
        }
    }
}
