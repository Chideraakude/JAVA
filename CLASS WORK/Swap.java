//Write a program that swaps the value of two variables (Choose your data type)

//variable1 = 2
//variable2 = 4
//NewVariable1 = variable1 + variable2 - varible1
//NewVariable2 = variable2 + variable1 - variable2
import java.util.Scanner;
    public class Swap{
    public static void main(String[]args){
    Scanner inputCollector = new Scanner(System.in);
    System.out.println("Enter first Variable");
    int NewVariable1 = inputCollector.nextInt();

    System.out.println("Enter second Variable");
    int NewVariable2 = inputCollector.nextInt();

    NewVariable1 = NewVariable1 + NewVariable2;
    NewVariable2= NewVariable1 - NewVariable2;
    NewVariable1 = NewVariable1 - NewVariable2;

    System.out.println("After Swapping: " );
    System.out.println("First Variable: " + NewVariable1);
    System.out.println("Second Variable: " + NewVariable2);



}
}
