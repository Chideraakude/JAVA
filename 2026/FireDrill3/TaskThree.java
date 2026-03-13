import java.util.Scanner;
import java.util.Arrays;

public class TaskThree{
    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.println("WELCOME TO CHIDERA'S SCORING GRADE SYSTEM'");
       

     

    int[] scores = new int[10];  


for (int counter = 0; counter < 10; counter++){

    System.out.println("Enter a Score: ");
    scores[counter] = inputCollector.nextInt();


   
}


System.out.println(Arrays.toString(scores));




}


}
