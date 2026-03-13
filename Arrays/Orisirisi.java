//Using scanner to colect array

import java.util.Scanner;

public class Orisirisi{


    public static void main(String[]args){

        Scanner userInput = new Scanner(System.in);

        int[]numbers = new int[5];
        
        for(int index = 0; index < numbers.length; index ++){


            System.out.println("Enter your number");
            numbers[index] = userInput.nextInt();
}
        for (int number : numbers);
            System.out.print(numbers + "");
}
}
