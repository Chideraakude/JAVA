//Write a program, if greater than 1000, add the coma. If less than 1000 add the dollar sign and print the same input


import java.util.Scanner;

public class Numbers{

    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a Number: ");
    int number = input.nextInt();

    if (number >= 1000){
        System.out.printf("%, d%n", number);


}
else if(number < 1000){
    System.out.println("$" + number);

}
    





}
}
