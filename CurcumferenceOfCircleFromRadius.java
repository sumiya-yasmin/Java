import java.util.Scanner;

public class CurcumferenceOfCircleFromRadius {
    public static void main(String[] args) {
        System.out.print("Input the radius: ");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        sc.close();
        getCurcumference(radius);
    }
    public static void getCurcumference(double r){
        double curcumference = 2*Math.PI*r;
        System.out.println(curcumference);
    }

}