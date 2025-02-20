import java.util.Scanner;

public class PowerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of number: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of power: ");
        int n = sc.nextInt();
        sc.close();
        getPowerNumber(x, n);
    }
    public static void getPowerNumber(int x, int n){
        double result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        System.out.println(x+ " raised to the power " +n+ " is " + result);

    }
}
