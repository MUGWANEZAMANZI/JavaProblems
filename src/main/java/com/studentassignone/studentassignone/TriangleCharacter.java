package com.studentassignone.studentassignone;


public class TriangleCharacter {
    public static void main(String[] args) {
        //int k = 7;
        for (int i = 0; i < 5; i++){
                for (int j = 5; j >i; j--){
                    System.out.print(" ");
                }
                for (int k = 0; k < i+1; k++){
                    System.out.print(" A ");
                }
                System.out.println("");
        }
    }
}
