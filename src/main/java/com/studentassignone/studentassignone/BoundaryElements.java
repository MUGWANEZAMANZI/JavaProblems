
package com.studentassignone.studentassignone;
import java.util.Scanner;

public class BoundaryElements {
    
    public static int [][] getMatrix(int r, int c){
        int a[][] = new int[r][c];
        for(int x = 0; x < r; x++){
            for( int y = 0; y < c; y++){
                a[x][y] =  (int) (Math.random()*  10);
            }
        }
        return a;
        
    }
    
    public static void solveMatrix(int y[][]){
        int rowBound[] = {0, y.length};
        int colBound[] = {0, y[0].length };
        int lastx = y.length;
        int lasty = y[0].length;
        
        System.out.println("The orignal matrix is:");
        
        for(int x = 0; x < y.length; x++){
            for( int z = 0; z < y[0].length; z++){
                System.out.print(y[x][z]);
                }
            System.out.println("");
        }

        System.out.println("Removing Boundayr elements:");
        for (int m = 0; m < y.length; m++) {
            for (int n = 0; n < y[0].length; n++) {
                if (m > 0 && m < lastx-1 && n > 0 && n < lasty-1)  System.out.print(y[m][n]);
                else System.out.print(" ");
               
            }
            System.out.println("");
        }
        
        
    }
    
    
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        solveMatrix(getMatrix(a,b));
        
    }
}
