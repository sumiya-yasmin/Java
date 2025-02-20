import java.util.Scanner;

public class ConditionsIfElse {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        try (Scanner input = new Scanner(System.in)) {
            int number = input.nextInt();
            if(number%2==0){
                System.out.println("The Number is even");
            }else{
                System.out.println("The number is odd");
            }
        }
    }
}
