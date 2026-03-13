import java.util.Scanner;
public class TaskTwentyOne{
    public static void main(String[]args){
    
        int secret = 8;

        while (true){
            Scanner input = new Scanner(System.in);

            System.out.println("Enter your secret Number: ");
            secret = input.nextInt();

            if (secret == 8){
                System.out.println("Correct");
                break;


            }
            else{
                System.out.println("Try again");
            }
           
                




        }
        
    }

}

