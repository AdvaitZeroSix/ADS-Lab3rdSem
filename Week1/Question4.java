//Store two matrices in 1-D arrays using Row-Major Mapping and perform matrix addition
package com.mycompany.advaitsaxena;
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 2, cols = 2;
        int[] A = new int[rows * cols];
        int[] B = new int[rows * cols];
        int[] Sum = new int[rows * cols];
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                A[i * cols + j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                B[i * cols + j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows * cols; i++) {
            Sum[i] = A[i] + B[i];}
        System.out.println("Sum Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(Sum[i * cols + j] + " ");
            }
            System.out.println();
        }
        sc.close();
        }
}
