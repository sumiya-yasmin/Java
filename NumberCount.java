import java.util.Scanner;

public class NumberCount {
    public static void main(String[] args) {
        System.out.print("Input the numbers");
        Scanner sc = new Scanner(System.in);
        countNumbers(sc);
        sc.close();
    }
    public static void countNumbers(Scanner sc){
        int positive=0, negative=0,zeroes=0;
        while(true){
            System.out.println("Enter a number (or type 'stop' to finish): ");
            if(sc.hasNextInt()){
                int num = sc.nextInt();
                if(num>0){
                    positive++;
                    System.out.println(num+ " is positive");
                }else if (num<0){
                    negative++;
                    System.out.println(num+ " is negative");
                }else{
                    zeroes++;
                    System.out.println("The number is zero");
                }
            }else{
                String input =sc.next();
                if(input.equalsIgnoreCase("stop")){
                    break;
                }else{
                    System.out.println("Invalid input. Please enter a number or type 'stop' to finish.");
                }
            }
           }

           System.out.println("\nSummary:");
           System.out.println("Positive numbers: " + positive);
           System.out.println("Negative numbers: " + negative);
           System.out.println("Zeros: " + zeroes);
    }
}
