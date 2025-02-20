import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        System.out.print("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
       findSumOfOdd(n);
        
    }
    public static void findSumOfOdd(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            if(i%2 != 0){
                sum= sum+i;
            }
        }
        System.out.println("Sum of odd Numbers till "+n+ " is "+sum);
    }
}

