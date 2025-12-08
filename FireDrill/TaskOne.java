//Collect 10 Scores and print sum

import java.util.Scanner;
public class TaskOne{
    public static void main(String[]arg){

        Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter a number");
            int Num1 = inputCollector.nextInt();

             System.out.print("Enter a number");
            int Num2 = inputCollector.nextInt();


             System.out.print("Enter a number");
            int Num3 = inputCollector.nextInt();

             System.out.print("Enter a number");
            int Num4 = inputCollector.nextInt();

             System.out.print("Enter a number");
            int Num5 = inputCollector.nextInt();
            
             System.out.print("Enter a number");
            int Num6 = inputCollector.nextInt();

               System.out.print("Enter a number");
            int Num7 = inputCollector.nextInt();


                 System.out.print("Enter a number");
            int Num8 = inputCollector.nextInt();
                
                 System.out.print("Enter a number");
            int Num9 = inputCollector.nextInt();

                 System.out.print("Enter a number");
            int Num10 = inputCollector.nextInt();


                int sum = Num1 + Num2 + Num3 + Num4 + Num5 + Num6 + Num7 + Num8 + Num9 + Num10 ;

                System.out.printf("The Sum of all numbers are: %d", sum );


}


}
