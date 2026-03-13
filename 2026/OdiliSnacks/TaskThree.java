import java.util.Scanner;

public class TaskThree{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
     int favouriteNumber = 0;

while ( favouriteNumber != 7){
    System.out.println("Guess a Number: ");
    favouriteNumber = input.nextInt();

        if (favouriteNumber == 7){
             System.out.println("That's my Favourite Number");

}  
   else {
         System.out.println("Nice Try, guess again!");
}  

}
   
}

}


