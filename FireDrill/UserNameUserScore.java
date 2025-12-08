import java.util.Scanner;
public class UserNameUserScore{
    public static void main(String[]arg){

        Scanner inputCollector = new Scanner(System.in);
        

   int sum = 0;
   userName = "";

for (int myCount = 1; myCount <= 10; myCount++ ){

    System.out.print("Enter a number: ");
            int score = inputCollector.nextInt();
       
           
            sum += score;
            
}


for (int myCountName = 1; myCountName <= 10; myCount++ ){

    System.out.print("Enter a name: ");
            String name = inputCollector.nextLine();
       
           
            userName += score;
            
}
    System.out.printf("The Sum of all numbers are: %d%n", sum );
    System.out.println("The average of all numbers are: %f%n \t", name );

}
    
}

