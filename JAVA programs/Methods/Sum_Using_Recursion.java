import java.util.Scanner;
class Sum_Using_Recursion{
    public static void main(String[] arg){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a natural number");
        int n= scn.nextInt();
        
        System.out.println("Sum of first "+ n+ " Natural numbers is "+ sum(n));

        


    }
    static int sum (int n){

        if(n==1) return n;
        return n+sum(n-1);
        



    }

}