package conditions;

import java.util.Scanner;

public class Calculator {
    public static int calculateNumbers(char op, int n1, int n2) {
        int ans = 0;
        if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
            if (op == '+') {
                ans = n1 + n2;
            }
            if (op == '-') {
                ans = n1 - n2;
            }
            if (op == '*') {
                ans = n1 * n2;
            }
            if (op == '/') {
                if (n2 != 0) {
                    ans = n1 / n2;
                }
            }
            if (op == '%') {
                ans = n1 % n2;
            } 
        }else {
            System.out.println("Invalid operation!!");
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the operand (or 'x' to exit): ");
            char op = in.next().trim().charAt(0);
            if (op == 'x' || op == 'X') {
                break;
            }
            System.out.println("Enter the first number");
            int num1 = in.nextInt();
            System.out.println("Enter the second number");
            int num2 = in.nextInt();
            int ans = calculateNumbers(op, num1, num2);
            System.out.println("Result: " + ans);

        }
    }
}