import java.util.Scanner;
class FibbOfFirstN {
    
    public static void main (String [] args){


        System.out.println("Enter how many Fibbonacci numbers required.");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a= 0;
        int b=1;
        int count = 0;

        while(count<n){
            System.out.println(a+" ");
            int c =a;
            a=b;
            b= a+c;
            
            count++;
        }
    }
}
