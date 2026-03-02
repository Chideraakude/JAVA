import java.util.Scanner;

public class SecondCourseMeal{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
     int secretNumber = 0;

while ( secretNumber != 1 && secretNumber != 2){
    System.out.println("Guess a Number: ");
    secretNumber = input.nextInt();

        if (secretNumber == 1 || secretNumber == 2){
             System.out.println("Valid Number Entered.");

}  
   else if (secretNumber > 2){
             System.out.println("Guess is Too High");

}
  else {
         System.out.println("Guess is Too Low");
}  

}
   
}

}
