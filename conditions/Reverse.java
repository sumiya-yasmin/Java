package conditions;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int reverse =0;
        while(n>0){
            int rem = n%10;
             reverse = reverse*10+rem;
             n/=10;
        }
        System.out.print("The reversed number is: "+reverse);
    }
}
