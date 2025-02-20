public class HollowButterflyPatter {
    public static void main(String[] args) {
        int n=5;
        //upperhalf
        for(int i=1;i<=n;i++){

            System.out.print("*");
            
            for(int j=1;j<=i-2;j++){
                System.out.print(" ");
            }
            if(i>1){
            
                System.out.print("*");
        }
            for(int j=1;j<=2*n-2*i;j++){
                System.out.print(" ");
            }

            System.out.print("*");

            for(int j=1;j<=i-2;j++){
                System.out.print(" ");
            }

            if(i>1){
            
                System.out.print("*");
            }

            System.out.println();
        }
        //lower half
        for(int i=n;i>=1;i--){

            System.out.print("*");
            
            for(int j=1;j<=i-2;j++){
                System.out.print(" ");
            }
            if(i>1){
            
                System.out.print("*");
        }
            for(int j=1;j<=2*n-2*i;j++){
                System.out.print(" ");
            }

            System.out.print("*");

            for(int j=1;j<=i-2;j++){
                System.out.print(" ");
            }

            if(i>1){
            
                System.out.print("*");
            }

            System.out.println();
        }
        
    }
}
