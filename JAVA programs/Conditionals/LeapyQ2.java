import java.util.Scanner;
class LeapyQ2 {

    public static void main (String[] args){
        Scanner scn = new Scanner (System.in);

        
        System.out.println("Please enter a year.");
        int a = scn.nextInt();

        if (a% 100 == 0){
            if(a%400 == 0){
                System.out.println("The year is leap.");
            }
            else
            System.out.println("The year is not leap.");
        
        }
        
        else if (a%4 ==0){
            System.out.println("The year is leap.");

        }

        else
        System.out.println("The year is not leap.");



    }
    
}
