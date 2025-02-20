import java.util.Scanner;

public class ConditionSwitch {
    public static void main(String[] args) {
        System.out.print("Enter your number:");
        try (Scanner input = new Scanner(System.in)) {
            int marks =input.nextInt();
            String grade = "Invalid";
            if(marks<=100 && marks >=0 ){
                switch(marks/10){
                    case 10: 
                        grade="A+";
                        break;
                    case 9:
                        grade = "A+";
                        break;
                    case 8: 
                        grade="A";
                        break;
                    case 7:
                        grade = "A-";
                        break;
                    case 6: 
                        grade="B";
                        break;
                    case 5:
                        grade = "C";
                        break;
                    case 4: 
                        grade="D";
                        break;
                    default:
                        grade = "F";
                        break;
                }
               System.out.println("The grade is: " + grade);
            }else{
                System.out.println("Invalid Number");
            }
        }
    }
}
