


import java.util.Scanner;

public class FourPointTwentyThree{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter how many numbers: ");
    int count = input.nextInt();

     System.out.println("Enter First Number: ");
     int firstNumber = input.nextInt();

    System.out.println("Enter Second Number: ");
    int secondNumber = input.nextInt();

    int largest;
    int secondLargest;

    if (firstNumber > secondNumber){
        largest = firstNumber;
        secondLargest = secondNumber;

    }else{
        largest = secondNumber;
        secondLargest = firstNumber;

}

    for (int counter = 3; counter<= count; counter++){
        System.out.println("Enter a Number: ");
        int number = input.nextInt();


        if (number > largest){
            secondLargest = largest;
            largest = number;

}else if (number > secondLargest){
            secondLargest = number;
}
    System.out.println("The Largest Is: " + largest);
        System.out.println("The Second Largest Is: " + secondLargest);

}








}


}
