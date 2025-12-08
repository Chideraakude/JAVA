import java.util.Scanner;
public class TaskFour{
    public static void main(String[]arg){

        Scanner inputCollector = new Scanner(System.in);
        

   int sumEven = 0;
    int sumOdd = 0;

for (int myCount = 1; myCount <= 10; myCount++ ){

    System.out.print("Enter a number: ");
            int score = inputCollector.nextInt();

           if (score % 2 == 0){
                sumEven += score;
                

}
            if (score % 2 != 0){


                sumOdd += score;
}
       
           
//            sum += score;
//            ave = sum/10.0;
            
}
    System.out.printf("The sum of even numbers are: %d%n", sumEven );
    System.out.printf("The sum of odd numbers are: %d%n", sumOdd );

}
    
}

