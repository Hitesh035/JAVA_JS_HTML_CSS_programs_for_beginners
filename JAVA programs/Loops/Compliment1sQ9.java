import java.util.*;
class Compliment1sQ9 {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter an integer.");

        long dec = scn.nextLong();
        long a = dec;
        long bin =0;
        long i=1;
        String binstr= "";

        

        while ( dec>0){

           long b = dec%2;
          // bin = (b*i)+bin; // Uncomment this if you want to get the binary value of the number. Also uncomment STATEMENT B
           if((b==0)){// Comment the below 'if' and 'else if' clauses if you do not want to get the 1's compliment of the number. ALso Comment STATEMENT A
            b=1;
           
           binstr =b + binstr;

           }
           else if ((b==1)){
            b=0;
            
            
            binstr =b + binstr;
           }
           dec/=2;
           i*=10;
        }
        System.out.println("The binary value of "+a+" is "+binstr);  //STATEMENT A
       // System.out.println("The binary value of "+a+" is "+bin);   //STATEMENT B
        
    }
    
}
