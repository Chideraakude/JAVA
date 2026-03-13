import java.util.Scanner;

public class TaskTwo{
    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Welcome To CHIDERA'S SCORING GRADE SYSTEM'");
       

     

    int[] scores = new int[10];  


for (int counter = 0; counter < scores.length; counter++){

    System.out.printf("Enter a Score %d: ", (counter + 1));
    scores[counter] = inputCollector.nextInt();


   
}
for (int score : scores){

    System.out.println(score);

}







}


}

