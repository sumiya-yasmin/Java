import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1= sc.nextInt();
        System.out.println("Enter second number: ");
        int num2= sc.nextInt();
       int gcd = getGreatestCommonDivisor(num1,num2);
       System.out.println("GCD is: " + gcd);
       sc.close();
    }
    public static int getGreatestCommonDivisor(int num1,int num2){
        while(num1!=num2){
            if(num1>num2){
                num1= num1-num2;
            }else{
                num2=num2-num1;
            }
        }
        // while (b != 0) { 
        //     int temp = b;
        //     b = a % b; 
        //     a = temp;
        // }
        return num1;
    }
}
