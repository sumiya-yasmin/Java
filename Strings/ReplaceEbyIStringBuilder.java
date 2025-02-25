package Strings;

import java.util.Scanner;

public class ReplaceEbyIStringBuilder {
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
        System.out.println("Enter your string: ");
        StringBuilder string = new StringBuilder(sc.nextLine());
        for(int i=0;i<string.length();i++){
            if(string.charAt(i) == 'e' ){
                string.setCharAt(i,'i');
            }else if (string.charAt(i) == 'E') {
                string.setCharAt(i, 'I'); 
            }
        }
        System.out.println("Updated String: " + string);
}
}


//string = string.replace('e', 'i').replace('E', 'I');

