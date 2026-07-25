//Write a Java program to convert a 2-D array into a 1-D array using Column-Major Mapping.
package com.mycompany.advaitsaxena;
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter No. of columns: ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        int[] oneD = new int[rows * cols];
        System.out.println("Enter array elements:");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int k = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                oneD[k++] = arr[j][i];
            }
        }
        System.out.println("Mapped 1-D Array:");
        for(int value : oneD){
            System.out.print(value + " ");
        }
    }
}
