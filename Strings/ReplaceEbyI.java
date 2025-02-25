package Strings;

import java.util.Scanner;

public class ReplaceEbyI {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your string: ");
        String string = sc.nextLine();
        String result = "";
        for(int i=0;i<string.length();i++){
            if(string.charAt(i) == 'e'){
                result+='i';
            }else if (string.charAt(i) == 'E') {
                result+='I';
            }
            else{
                result+=string.charAt(i);
            }
        }
        System.out.println(result);

    }
}
