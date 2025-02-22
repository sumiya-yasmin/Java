package array;

import java.util.Scanner;

//Taking an array as an input and printing its elements.
public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size of array: ");
        int size =sc.nextInt();
        int numbers[] =new int[size];
        System.out.println("Enter the values of the array");
        for(int i=0;i<size;i++){
             numbers[i]=sc.nextInt();
        }
        System.out.println("The values of the array are: ");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }
}
