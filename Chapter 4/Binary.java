
import java.util.Scanner;

public class Binary{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter binary number");
    int binaryNumber = input.nextInt();

    int decimalValue = 0;
    int base = 1;

    while (binaryNumber > 0){
    
    int number = binaryNumber % 10;
    
    decimalValue = decimalValue + (number * base);
    base = base * 2;
    binaryNumber = binaryNumber / 10;


}

    System.out.println("Decimal equivalent is: " +  decimalValue);
    input.close();
}


}
