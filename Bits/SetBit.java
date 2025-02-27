package Bits;

import java.util.Scanner;

public class SetBit {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of posistion: ");
        int i = sc.nextInt();
        int bitMask = 1<<i;
        int newNUmber = bitMask | n;
        String binaryString = Integer.toBinaryString(newNUmber);
        System.out.println("Binary representation: " + binaryString);
        System.out.println("Decimal representation: " + newNUmber);
    }
}
