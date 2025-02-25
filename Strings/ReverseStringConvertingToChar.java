package Strings;
import java.util.Scanner;

public class ReverseStringConvertingToChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = sc.next();

        char[] charArray = name.toCharArray(); // Convert string to char array
        int left = 0, right = charArray.length - 1;

        while (left < right) {
            // Swap characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move pointers
            left++;
            right--;
        }

        // Convert back to string
        String reversedName = new String(charArray);
        System.out.println("Reversed String: " + reversedName);
    }
}

