import java.util.Scanner;
import java.util.Arrays;

public class TaskFour{
    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.println("WELCOME TO CHIDERA'S SCORING GRADE SYSTEM'");
       

     

    int[] scores = new int[10];  


for (int counter = 0; counter < scores.length; counter++){

    System.out.println("Enter a Score: ");
    scores[counter] =  2 + 2 * counter;



}

System.out.printf("%s%8s%n", "Index", "Value");

//}
for (int counter = 0; counter < scores.length; counter++){
    System.out.printf("%5d%8d%n", counter, scores[counter]);


}





}


}
