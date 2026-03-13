
import java.util.Scanner;
    public class TaskTwentyFive{
    public static void main(String[]args){

    Scanner scanner = new Scanner (System.in);
    String correctPassword = "python";
    String userInput;
    


        for (int count = 1; count <= 3; count++){

         

        System.out.println("Enter correct password");
        userInput = scanner.nextLine();

            if(userInput.equalsIgnoreCase(correctPassword)){
                System.out.println("Success");
                return;

            }
            else{
                System.out.println("Try Again!!");
            }
        }
        System.out.println("Locked out");

    }

}
