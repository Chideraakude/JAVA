
import java.util.Scanner;
    public class TaskThirteen{
    public static void main(String[]args){
    Scanner chidera = new Scanner(System.in);
    

        int minimumAge = 10;

        System.out.println("Enter a Number: ");
        minimumAge = chidera.nextInt();
 
     

        if (minimumAge >= 10){
            System.out.println("Welcome To The Show");
        }
        
        else{
            System.out.println("Sorry, You're too young'");
        }
 
    }

}
