//Write a Java program to calculate the 1-D index position of an element present at row i and column j
//using the Row-Major Mapping formula
package com.mycompany.advaitsaxena;
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. of rows: ");
        int rows2d = sc.nextInt();
        System.out.print("Enter No. of columns: ");
        int cols2d = sc.nextInt();
        System.out.print("Enter row index: ");
        int row = sc.nextInt();
        System.out.print("Enter column index: ");
        int col = sc.nextInt();
        int index = row * cols2d + col;
        System.out.println("1-D Index Position: " + index);
        sc.close();
    }
}
