package com.studentassignone.studentassignone;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER 1
 */
public class DownwardTriangleStar {
    public static void main(String[] args){
         Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = n; j > i; j--){
                System.out.print(" * ");
            }
            System.out.println();   
        }
    
    }
}
