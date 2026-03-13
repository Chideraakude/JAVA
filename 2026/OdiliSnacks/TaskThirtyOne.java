import java.util.Scanner;

public class TaskThirtyOne{
    public static void main(String[]args){

    int age = 12;
    int height = 140;

    while (true){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter your age: ");
    age = input.nextInt();

    System.out.println("Enter your height: ");
    height = input.nextInt();


        if (age >= 12 && height >= 140){

            System.out.println("Ride allowed!");
        break;


        }
        else{
            System.out.println("Too Young and too short to ride!");


        }




    }





    }





}
