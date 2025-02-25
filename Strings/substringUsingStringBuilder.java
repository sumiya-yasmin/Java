package Strings;

import java.util.Scanner;

public class substringUsingStringBuilder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your email: ");
        String email = sc.next();

        StringBuilder sb = new StringBuilder(email);
        int endIndex = sb.indexOf("@");

        if (endIndex != -1) {
            sb.delete(endIndex, sb.length());
            System.out.println("Your username: " + sb);
        } else {
            System.out.println("Invalid email! '@' not found.");
        }
    }
}


