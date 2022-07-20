import java.util.Scanner; 
class AngstormNumberQ12 {
    public static void main(String [] args){

        System.out.println("Please enter a number.");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int sum=0;
        int b=0,c=0,digits=0;
        for(int i=a; i>0;i/=10){
            digits++;
            }

        for(int i=a; i>0;i/=10){
             b = i%10;
             c = i%10;
            for (int j=0;j<digits-1;j++){
                b*=c;
                

            }
            sum+=b;
            
        }
        if(sum==a)
        System.out.println("It is an angstorm number.");
        else
        System.out.println("It is not an angstorm number.");


    }
    
}
