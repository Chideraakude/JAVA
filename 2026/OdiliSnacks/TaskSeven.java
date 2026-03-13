

import java.util.Scanner;

public class TaskSeven{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    String password = "secret123";

    while (true){
        System.out.println("Enter your password: ");
        password = input.nextLine();

        if (password.equalsIgnoreCase("secret123")){
            System.out.println("Access Granted! Welcome!");
                    break;
        }
        else{
            System.out.println("Access Denied");
        }

    }

    

 


    }


    
    





}
