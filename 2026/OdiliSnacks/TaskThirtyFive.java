import java.util.Scanner;
public class TaskThirtyFive{
    public static void main(String[]args){

    ticketPrice();



    }

    public static void ticketPrice(){
    Scanner scanner = new Scanner(System.in);
    
    int adultPrice = 10;
    int childPrice = 5;

        while (true) {
             System.out.println("Enter Your Age: ");
             int age = scanner.nextInt();

            if (age >= 18){
                System.out.println("Price: $" + adultPrice);
                break;

            }
            else{
                System.out.println("Price: $" + childPrice);
                
                }



        }

   


    }



}
