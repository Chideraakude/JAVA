import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        int[] number = new int[5];
        evenNumbers(number);
    }

    public static void evenNumbers(int[] number) {
        Scanner input = new Scanner(System.in);

        for (int count = 0; count < number.length; count++) {
            System.out.print("Enter a Number: ");
            number[count] = input.nextInt();

            if (number[count] % 2 == 0) {
                System.out.println("Even Number: " + number[count]);

        }
            }
}
}
