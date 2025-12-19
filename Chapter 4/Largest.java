import java.util.Scanner;

public class Largest{
    public static void main(String[]args){
    Scanner inputCollector = new Scanner(System.in);
    
    int number;

    int counter = 1;
    int largest;

    System.out.print("Enter an integer 1: ");
    largest = inputCollector.nextInt();


while (counter <= 10){
    System.out.print("Enter an integer");
    number = inputCollector.nextInt();

if (number > largest){

    largest = number;

}

//    counter = counter + 1;
counter++;

}


System.out.println("The Largest Number is: " + largest);



}
}
