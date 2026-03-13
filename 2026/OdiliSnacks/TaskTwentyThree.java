import java.util.Scanner;

public class TaskTwentyThree{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a score between 0 - 100: ");
    int score = input.nextInt();

        if (score >= 90){
            System.out.println("ou have aquired a grade A");

        }
        else if (score <= 89 || score >= 80){

            System.out.println("You have aquired a grade B");
        }
        else if (score <= 79 || score >= 70){

            System.out.println("You have aquired a grade C");
        }
        else {
            System.out.println("You have aquired a grade F");

        }
        
    }

}
