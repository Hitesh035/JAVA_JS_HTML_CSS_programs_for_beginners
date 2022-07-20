import java.util.Scanner; 
class PatternQ21 {
    public static void main (String[] args){
    
        double n =7;
        int i=1;
       
        while(i<=n){
        if( i==1 || i==n){
            for(int j=1;j<=n;j++){
                if( j==i || j==n)
                System.out.print("*");
                else
                System.out.print(" ");

            }
            i++;
            System.out.println();
        }
        else{
            for(int j=1;j<=n;j++){
                if( j==i || j==2*i || j==i/2)
                System.out.print("*");
                else
                System.out.print(" ");

        }
            i++;
            System.out.println();
        }
    }
        



                       
        
    }
}
    

