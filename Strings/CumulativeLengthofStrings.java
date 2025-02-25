package Strings;

import java.util.Scanner;

public class CumulativeLengthofStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of String input: ");
        int size = sc.nextInt();
        String array[] = new String[size];
        System.out.println("Enter your strings");
        int totalLength =0;
        for(int i=0;i<size;i++){
            array[i] =sc.next();
            totalLength = totalLength + array[i].length();
        }
        System.err.println("The cumulative length of the string are: "+" "+totalLength);
    }
}
