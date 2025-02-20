import java.util.*;

public class Conditions {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        try (Scanner input = new Scanner(System.in)) {
            int age = input.nextInt();
            if (age>18){
                System.out.print("You are eligible to marry");
            }else{
                System.out.print("You can not marry");
            }
        }

    }
}
