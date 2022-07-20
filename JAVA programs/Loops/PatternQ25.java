import java.util.Scanner;
class PatternQ25{
    public static void main(String[] args){
        int n=20;
        int i=1;
        int spaces=(n-n/2)-1;
        int stars = 1;

        for (i = n-n/2; i<=n;i++){
            for(int j=spaces;j>0;j--){
                System.out.print(" ");
            }
            for(int k=stars;k>0;k--){
                System.out.print("*");
            }
            spaces--;
            stars+=2;
            System.out.println();
            
            }
           
            

            }
        }
    
