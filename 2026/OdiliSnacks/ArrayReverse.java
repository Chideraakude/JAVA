import java.util.Scanner;

public class ArrayOfNumbers {

    public static void main(String[] args) {
        int[] number = new int[10];
        secondLargestNumber(number);
    }

    public static void secondLargestNumber(int[] number) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        int largest, secondLargest;

        if (firstNumber > secondNumber) {
            largest = firstNumber;
            secondLargest = secondNumber;
        } else {
            largest = secondNumber;
            secondLargest = firstNumber;
        }

        for (int count = 3; count <= number.length; count++) {
            System.out.print("Enter number " + count + ": ");
            int newNumber = input.nextInt();

            if (newNumber > largest) {
                secondLargest = largest;
                largest = newNumber;
            } else if (newNumber > secondLargest) {
                secondLargest = newNumber;
            }
        }

        System.out.println("The Second Largest Is: " + secondLargest);
    }
}
