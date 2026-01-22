import java.util.Random;
import java.util.Scanner;


    public class RandomIntegers3{
    public static void main(String[] args){
    Random random = new Random();


for (int counter = 0; counter < 20; counter++){
     int face = random.nextInt(20);
    System.out.println(face);



Scanner input = new Scanner(System.in);
System.out.println("Guess a number: ");
int number = input.nextInt();

if (number > face){
    System.out.println("Ewu Gambia, Its Too High!!");

}
else if (number < face ){
    System.out.println("Maggot, Guy Its Too Low!!!");

}else {
    System.out.println("Correct Guy!!!");
    break;

}

}







}





}
