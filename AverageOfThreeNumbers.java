import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the three Numbers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        float avg= (a+b+c)/3.0f;

        System.out.print("Average:" +avg);
    }
}
