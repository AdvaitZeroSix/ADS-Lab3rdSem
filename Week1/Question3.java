//Write a Java program to convert a given 1-D array back into a 2-D array of specified dimensions.
package com.mycompany.advaitsaxena;
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter No. of columns: ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        int[] oneD = new int[rows * cols];
        System.out.println("Enter array elements:");
        for(int i = 0; i < rows*cols; i++){
            oneD[i] = sc.nextInt();
        }
        for(int i = 0 ; i < rows ; i++ ){
            for(int j = 0 ; j < cols ; j++){
                arr[i][j]=oneD[(i*cols)+j];
            }
        }
        System.out.println("Final 2d array");
        for(int i = 0 ; i < rows ; i++ ){
            for(int j = 0 ; j < cols ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
}
