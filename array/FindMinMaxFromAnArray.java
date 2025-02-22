package array;

import java.util.Scanner;

public class FindMinMaxFromAnArray {
    public static void main(String[] args) {   
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of the numbers you want to input: ");
        int size = sc.nextInt();
        int numbers[]=new int[size];
        System.out.print("Enter the numbers: ");
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<min){
                min=numbers[i];
            }
            if (numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println("Largest number is : " + max);
        System.out.println("Smallest number is : " + min);
    }
}
