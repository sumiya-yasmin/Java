import java.util.*;
public class HelloWorld {
    public static void main(String[] args) {
        try (Scanner simi = new Scanner(System.in)) {
            int a = simi.nextInt();
            int b = simi.nextInt();
            int sum= a+b;
            System.out.print(sum);
        }
        
    }
}
