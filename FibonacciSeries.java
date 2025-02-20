import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.print("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev=0;
        int next=1;
    
        //upto n terms
       /*   while(prev<=n){
             System.out.print(prev + " ");
            int curr = prev+next;
            prev=next;
            next=curr;
        }*/
        //of n terms
       System.out.print(prev+ " ");
       if(n>1){
        System.out.print(next+" ");
       }
       for(int i=2;i<n;i++){
        int curr=prev+next;
        System.out.print(curr+" ");
        prev=next;
        next=curr;
       }
    }
}
