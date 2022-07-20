import java.util.Scanner; 
class PerfectNumberQ11 {
    public static void main (String[] args){
        System.out.println("Please enter a positive integer greater than 1.");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int flag = 0;

        for (int i=2;i<=a/2;i++){

            if(a%i ==0){
                flag+=i;
            }
        }
        if(flag==0)
        System.out.println("The number is prime!");
        else if((++flag)==a)
        System.out.println("The number is a perfect number!");
        else
        System.out.println("The number is not a perfect number.");
    }
    
}
