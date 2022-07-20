import java.util.Scanner;
class Method_Overloading {
    //A program to detect the type of payment done by a user with command line arguments.
    // This program is faulty. Will throw runtime exceptions in case when only one string argument is prvided in the command line.

    static void paymentType(String a){
        System.out.println("UPI payment successsful from "+a);
    }
    static void paymentType(String a, String b){
        System.out.println("Bank transfer successful from "+ a+" with a/c number "+ b);
    }
    static void paymentType(int a){
        System.out.println("Card payment successsful from card number " + a);
    }

    public static void main(String[] a){
        int i=0;
        int j = 0;
        if(a.length == 1){
        for(i=0; i < a.length; i++){
           j= Integer.parseInt(a[i]);
        }
        if(j==0)
        paymentType(a[0]);
        if(j>0)
        paymentType(j);
            
        }
        else{
            
            paymentType(a[0],a[1]);
        }
        
        
    }
    
}
