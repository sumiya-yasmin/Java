package Strings;

import java.util.Scanner;

public class ReverseStringUsingStringBuillder {
    public static void main(String[] args) {
          Scanner sc =new Scanner(System.in);
        System.out.print("Input your name: ");

        StringBuilder name = new StringBuilder(sc.next());
        int left=0, right= name.length()-1;
        while(left<right){
            char leftChar = name.charAt(left);
            char rightChar =name.charAt(right);
            name.setCharAt(left, rightChar);
            name.setCharAt(right, leftChar);
            left++;
            right--;
           
        }
        System.out.println("Reversed String: " + name);
    }
}

