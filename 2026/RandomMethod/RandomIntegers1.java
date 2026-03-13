import java.util.Random;
import java.util.Scanner;


    public class RandomIntegers1{
    public static void main(String[] args){
    Random random = new Random();

    int face =  random.nextInt(20);
    System.out.println(face);



Scanner input = new Scanner(System.in);
System.out.println("Guess a number: ");
int number = input.nextInt();

if (number != face){
    System.out.println("Ewu Gambia, Common Guess again!!");

}
else{
    System.out.println("Correct Guy!!!");

}









}





}

