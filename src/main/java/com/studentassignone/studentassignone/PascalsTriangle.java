package com.studentassignone.studentassignone;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>>  Triangle(int a){
        List<List<Integer>> mat = new ArrayList<>();
        for(int row = 0; row < a; row++){
            var arr = new ArrayList<Integer>();
            for(int i = 0; i <= row; i++){
                if (i == 0 || i == row) arr.add(1);
                else arr.add(mat.get(row-1).get(i-1) + mat.get(row-1).get(i));
               
            }
        mat.add(arr);
        
        }
       return mat;
        
    }
    
    public static void Display(List<List<Integer>> pascal){
        for(List<Integer> i: pascal){
            for(Integer j : i){
                System.out.print(j + " ");
            }
            System.out.println("");
            
        }
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        Display(Triangle(a));
    }
}
