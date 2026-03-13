import java.util.Scanner;

public class TaskThirtyThree{
    public static void main(String[]args){

    smartGuess();



    }

    public static void smartGuess(){

    Scanner input = new Scanner(System.in);

   int answer = 25;
   int guess;

    while(true){
        System.out.println("Enter an answer: ");
        guess = input.nextInt();

        if (guess == answer){
            System.out.println("Correct!");
            break;

        }
        else if (guess > answer){
            System.out.println("Too High!");
        }
        else{
            System.out.println("Too Low");
        }

    }




    }



}
