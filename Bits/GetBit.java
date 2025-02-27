package Bits;

import java.util.Scanner;

public class GetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of posistion: ");
        int i = sc.nextInt();
        int bitMask = 1<<i;
        if((bitMask & n)==0){
            System.out.println("bit was zero");
        } else {
            System.out.println("bit was one");
        }  
    }
}
