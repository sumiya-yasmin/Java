package array;

import java.util.Scanner;

//Take an array of names as input from the user and print them on the screen.
public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers of names you wish to input: ");
        int size = sc.nextInt();
        String names[]= new String[size];
        System.out.println("Enter the names:");
        for(int i=0;i<size;i++){
             names[i] = sc.next();
        }
        System.out.println("The names are:");
        for(int i=0;i<names.length;i++){
            System.out.println("Name "+(i+1)+" is "+names[i]);
        }
        System.out.println("Enter the name you love");
        String x= sc.next();
        for(int i=0;i<names.length;i++){
            if(names[i].equals(x)){
               System.out.println("My cutu "+i+" "+names[i]);
            }
            
        }
    }
}
