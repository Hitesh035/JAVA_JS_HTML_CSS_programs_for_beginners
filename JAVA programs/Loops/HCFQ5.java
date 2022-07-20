import java.util.*;
class HCFQ5 {

    public static void main (String[] args){

        System.out.println("Please enter two integers.");

        Scanner scn = new Scanner (System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();

        int n = a<b? a:b;
        int aflag= 0;
        int bflag =0;

        for(int i = n/2; i>=2; i--){
            /* Initialising i from n/2 will flag both integers as prime if they are indeed prime.
             * However if i is initialised as n then if the smaller number is prime the program will not detect it.
             * Because the loop will run from n to 2 and n%n is 0. The flag for the smaller variable will be modified.
             * And the if for that number outside 'for' loop won't be executed. Even if it prime.
             * Also initialising i from n/2 makes the program faster because of less iterations for the 'for' loop.
             * A number cannot have factors after its half value.
             */

            if (a%i ==0 && b%i == 0){
            
            System.out.println("The HCF of "+ a + " and "+ b + " is "+ i);
            
            return;}

            if (a%i==0){
                aflag++;
            }
            if (b%i==0){
                bflag++;
            }
            
            /* 
            else if (a%i !=0 && b%i != 0)
            System.out.println(a+" and "+b+" are Prime numbers, cannot find HCF.");
            else if ( b%i != 0)
            System.out.println(b+" is a Prime number, cannot find HCF.");
            else
            System.out.println(a+ " is a Prime number, cannot find HCF.");
            break;
            */
        }
        // Need a program if number(s) are prime.
        if(aflag ==0 )
        System.out.println(a+ " is a Prime number, cannot find HCF.");
        if(bflag ==0 )
        System.out.println(b+ " is a Prime number, cannot find HCF.");

    }
    
}
