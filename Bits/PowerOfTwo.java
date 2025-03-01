package Bits;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        if((n>0) && ((n & (n-1))==0)){
        System.out.print("The number is power of 2");
        }else{
            System.out.print("The number is not power of 2");
        }
    }
}
