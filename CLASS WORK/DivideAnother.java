//Write a program that checks whether one number is divisible by another

import java.util.Scanner;
public class DivideAnother{
public static void main(String[]args){
Scanner inputCollector = new Scanner(System.in);
System.out.println("Enter First Number: ");
int FirstNumber = inputCollector.nextInt();

System.out.println("Enter Second Number: ");
int SecondNumber = inputCollector.nextInt();

if (FirstNumber % SecondNumber == 0)
    System.out.println("First Number is Divisible By second Number");
else
    System.out.println("First Number is Not Divisible By Second Number");
    }
}
