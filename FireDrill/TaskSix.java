import java.util.Scanner;
public class TaskSix{
    public static void main(String[]arg){

        Scanner inputCollector = new Scanner(System.in);
        

   int sumEven = 0;
    double sumEvenAverage= 0.0;

for (int myCount = 1; myCount <= 10; myCount++ ){

    System.out.print("Enter a number: ");
            int score = inputCollector.nextInt();

           if (score % 2 == 0){
                sumEven += score;

                sumEvenAverage = sumEven/10.0;
                

}
          
           
//            sum += score;
//            ave = sum/10.0;
//            Total score/even counter
}
    System.out.printf("The average of even numbers are: %f%n", sumEvenAverage );
//    System.out.printf("The sum of odd numbers are: %d%n", sumOdd );

}
    
}

