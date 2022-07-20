import java.util.Scanner;
class DecToBinQ10 {
    
    public static void main(String []args){

        System.out.println("Please enter a Binary Number.");
        Scanner scn = new Scanner(System.in);

        long bin = scn.nextLong();
        long c = bin;
        long i =1;
        long dec=0;

        while(bin >0){
            long a= bin%10;
            dec = (a*i)+ dec;
            i*=2;
            bin/=10;
        }

        System.out.println("The Decimal of "+c+" is "+ dec);
    }
}
