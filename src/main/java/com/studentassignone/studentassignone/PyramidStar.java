
package com.studentassignone.studentassignone;
import java.util.Scanner;

public class PyramidStar {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        
        
        for( int i = 0; i < N; i++){
            for( int j = 1; j < N-i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < 2*i-1; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
