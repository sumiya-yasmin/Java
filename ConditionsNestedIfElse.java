import java.util.Scanner;

public class ConditionsNestedIfElse {
    public static void main(String[] args) {
        System.out.println("Input the numbers here");
        Scanner input = new Scanner(System.in);
        int a =input.nextInt();
        int b = input.nextInt();
        if(a>b){
            System.out.println("a is greater than b");
        }else if(a==b){
                System.out.println("both are equal");
        }else{
                System.out.println("b is greater");
            }
        }

    }

