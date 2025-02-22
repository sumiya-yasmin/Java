package array;

import java.util.Scanner;

public class PrintMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of row: ");
        int rows = sc.nextInt();
        System.out.println("Enter the value of column: ");
        int cols= sc.nextInt();
        int matrix[][]=new int [rows][cols];
        System.out.println("Enter the values of matrix: ");
        for(int i=0;i<rows;i++){
         for(int j=0;j<cols;j++){
            matrix[i][j]=sc.nextInt();
         }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
             System.out.print(matrix[i][j]+"   ");
            }
            System.out.println();
           }
        System.out.print("Enter the element you want to find: ");
        int x =sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==x)
             System.out.print("Element found at location (" + (i+1) + ", " + (j+1) + ")");
            }
           }
    }
}
