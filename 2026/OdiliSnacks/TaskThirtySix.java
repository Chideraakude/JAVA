import java.util.Scanner;
public class TaskThirtySix{
    public static void main(String[]args){

    factorsOfFour();



    }

    public static void factorsOfFour(){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int number = input.nextInt();
    
    int factorCount = 0;

        for(int count = 1; count <= number; count++){
            if(number % count == 0){
                factorCount++;

            }
        }

        System.out.println(factorCount);
    }



}
