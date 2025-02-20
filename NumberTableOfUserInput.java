import java.util.Scanner;

public class NumberTableOfUserInput {
    public static void main(String[] args) {
        System.out.print("Enter a Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=10;i++){
            int mult=1;
            mult= i*n;
            System.out.println(mult);
        }
    }
}
