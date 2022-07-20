import java.util.Scanner;
class MulTableQ4 {

    public static void main (String[] args){
        System.out.println("Please enter an integer.");

        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();

        for(int i=1; i<=10; i++){

            System.out.println(a + "*"+ i + " = " + (a*i));

        }

    }
    
}
