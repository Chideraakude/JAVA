import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        int[] number = new int[5];
        evenNumbers(number);
    }

    public static void evenNumbers(int[] number) {
        Scanner input = new Scanner(System.in);

        for (int count = 0; count < number.length; count++) {
            System.out.print("Enter a Number: ");
            number[count] = input.nextInt();

            for(int count = 0; count < numbers.length - 1; count++) )

            if (number[count] % 2 == 0) {
                System.out.println("Even Number: " + number[count]);

        }
        
            }
    }
}
