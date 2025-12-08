import java.util.Scanner;
public class TaskThree{
    public static void main(String[]arg){

        Scanner inputCollector = new Scanner(System.in);
        

   int sum = 0;
   double ave = 0.0;

for (int myCount = 1; myCount <= 10; myCount++ ){

    System.out.print("Enter a number: ");
            int score = inputCollector.nextInt();
       
           
            sum += score;
            ave = sum/10.0;
            
}
    System.out.printf("The average of all numbers are: %d%n", sum );
    System.out.printf("The average of all numbers are: %f%n", ave );

}
    
}

