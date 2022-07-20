import java.util.*;
class EbillQ1 
{
public static void main(String[] agrs){

    Scanner scn = new Scanner (System.in);

    System.out.println("Please enter the number of complete units(DO NOT ENTER FRACTIONAL VALUE)");

    int a = scn.nextInt();
    
    int b;
    

    if (a< 0){
        System.out.println("Please enter a valid number of units");
        return;
    }

    if (a <= 50){
        System.out.println("Bill amount is " + 0);
    }

    if (a>50 && a <= 100 ){
        b = a - 50;
        System.out.println("Bill amount is " + b*3 );
    }
    if (a>100 && a <= 150 ){
        b = a - 100;
        System.out.println("Bill amount is " + ((50*3) + (b*5)) );
    }
    if (a>150 && a <= 200 ){
        b = a - 150;
        System.out.println("Bill amount is " + ((50*3) +(50*5)+(b*7)) );
    }
    if (a>200){
        b = a - 200;
        System.out.println("Bill amount is " + ((50*3) +(50*5)+(50*7) + (b*12)) );
    }
    



}
}