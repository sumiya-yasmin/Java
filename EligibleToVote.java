import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.close();
        getEligiblity(age);
       
    }
    public static void getEligiblity(int age){
        if(age>=18){
            System.out.print("You are eligible to vote");
           }else{
               System.out.print("You are underage, you can not vote");
           }
    }
}
