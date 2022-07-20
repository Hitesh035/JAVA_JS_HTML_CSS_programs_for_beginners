import java.util.Scanner;
public class SimDetails {
    public static void main(String[] a){

        Scanner scn = new Scanner(System.in);

        

        
        boolean flag = true;
        while(flag){
        System.out.println("Please select a SIM\n1.Airtel\n2.Jio\n3.Exit");
        long choice = scn.nextLong();
        if(choice==1){
            Airtel a1 = new Airtel("Hitesh",554356646);
            a1.sim_Details();
            while(flag){
                System.out.println("Press 1 to return to previous menu\nPress 2 to exit the application");
                choice = scn.nextLong();
                if(choice == 1){
                    break;
                }
                else if(choice == 2){
                    return;
                }
                else{
                    System.out.println("Invalid option");
                }

            }

            
        }
        else if(choice==2){
            Jio j1 = new Jio("Hitesh",558856646);
            j1.sim_Details();
            while(flag){
                System.out.println("Press 1 to return to previous menu\nPress 2 to exit the application");
                choice = scn.nextLong();
                if(choice == 1){
                    break;
                }
                else if(choice == 2){
                    return;
                }
                else{
                    System.out.println("Invalid option");
                }

            }
            
        }
        else if(choice == 3){
            return;
        }
        else{
            System.out.println("Invalid option");
            
        }
    }



    


    }
    
}

class Sim{
    String name;
    long number;

    Sim(String name, long number){
        this.name= name;
        this.number = number;
    }

    public void sim_Details(){
        System.out.println(this.name);
        System.out.println(this.number);

    }
}

class Airtel extends Sim{
    Airtel(String name, long number){
        super(name,number);

    }

    
}

class Jio extends Sim{
    Jio(String name, long number){
        super(name,number);
        
    }
}
