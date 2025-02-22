package pattern;
public class HollowRombhus {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            int space=n-i;
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            if(i == 1||i == n ){
                 for(int j=1; j<=n;j++){
                  System.out.print("* ");
                }
            }else{
                
                    System.out.print("* ");
                    for(int j=1;j<=n-2;j++){
                        System.out.print("  ");
                    }
                    System.out.print("* ");
                 }
                 System.out.println();
            }
        }

    }

