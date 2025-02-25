package array;

import java.util.Scanner;

public class TransposeofMatrix {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Row: ");
        int rowNo = sc.nextInt();
        System.out.println("Column: ");
        int colNo = sc.nextInt();
        int matrix[][] = new int [rowNo][colNo];
        System.out.println("Input the value of matrix: ");
        for(int i=0;i<rowNo;i++){
            for(int j=0;j<colNo;j++){
             matrix[i][j] = sc.nextInt();
            }
        }
        int transpose[][] = new int[colNo][rowNo]; 
        for (int i = 0; i < rowNo; i++) {
            for (int j = 0; j < colNo; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("The tranpose of the matrix is: ");
        for(int i=0;i<colNo;i++){
            for(int j=0;j<rowNo;j++){
            System.out.print(matrix[j][i]+" ");
            }
            System.err.println();
        }
    }
}
