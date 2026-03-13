

import java.util.Scanner;
    public class TaskEleven{
    public static void main(String[]args){
    Scanner chidera = new Scanner(System.in);
    
    System.out.println("Enter a Number: ");
    int number = chidera.nextInt();
 
     

        if (number > 0){
            System.out.println("Positive");
        }
        else if (number == 0){
            System.out.println("Zero");
        }
        else{
            System.out.println("Negative");
        }
 
    }

}
