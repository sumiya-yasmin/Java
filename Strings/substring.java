package Strings;

import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Input your email: ");
        String email = sc.next();
        int endIndex = -1;
        for(int i=0;i<email.length();i++){
            if(email.charAt(i) == '@'){
               endIndex=i;
            break;
            }
        }
        if (endIndex != -1) { 
        String username = email.substring(0, endIndex);
        System.out.println("Your username: " + username);
    } else {
        System.out.println("Invalid email! '@' not found.");
    }
    }
}

//This is the better approach
