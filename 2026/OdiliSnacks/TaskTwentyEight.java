import java.util.Scanner;
public class TaskTwentyEight{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a Number: ");
    int numberOne = input.nextInt();

    System.out.println("Enter a Number: ");
    int numberTwo= input.nextInt();

    System.out.println("Enter a Sign (+ or -): ");
    String sign= input.next();

    int result = (numberOne + numberTwo);
    int resultTwo = (numberOne - numberTwo);

        if (sign.equals("+")){
            System.out.println(numberOne + "+" + numberTwo + "=" + result);
        }
        else if (sign.equals("-")){

            System.out.println(numberOne + "-" + numberTwo + "=" + resultTwo);
        }


    }

}
