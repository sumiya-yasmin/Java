package conditions;

import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number greater than zero: ");
        int n = in.nextInt();
        System.out.print("Enter the number you want to count:");
        int x = in.nextInt();
        int count =0;
        while(n>0){
            int rem = n%10;
            if(rem==x){
                count++;
            }
        n =n/10;
    }
    System.out.println("The count is" + " "+ count);
    }
}
