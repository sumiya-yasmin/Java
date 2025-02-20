//Print the sum of first n natural numbers

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.print("input the value of n:");
      int sum=0;
      Scanner input= new Scanner(System.in);
      int n =input.nextInt();
        for(int i=1;i<=n;i++){
            sum= sum+i;
        }
        System.out.println(sum);
    }
}
