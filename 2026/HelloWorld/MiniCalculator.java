import java.util.Scanner;

public class MiniCalculator{
    public static void main(String[]args){
    Scanner inputCollector = new Scanner(System.in);
    
    System.out.println("+, -, /, * : ");
    String operation = inputCollector.nextLine();

    System.out.println("Enter a Number: ");
    double number = inputCollector.nextDouble();
    
    System.out.println("Enter The Second Number: ");
    double number2 = inputCollector.nextDouble();

    System.out.println("Enter The Third Number: ");
    double number3 = inputCollector.nextDouble();

    double answer = 0;
    double result = 0;
    switch (operation){
    case "+":
        answer = add(number, number2, number3);
        result = add(number, number2);
        break;
    case "-":
        answer = subtract(number,  number2, number3);
        result = subtract(number, number2);
        break;
    case "/":
        answer = divide(number, number2, number3);
        result = divide(number, number2);
        break;
    case "*":
        answer = multiply(number, number2, number3);
        result = multiply(number, number2);
    case "_":
        System.out.println ("This is not a math operator!! Try Again");
        return;
}


System.out.println("The Answer: " + answer);
System.out.println("The Answer: " + result);

}
//    String number2 = inputCollector.nextLine();


public static double add(double number, double number2, double number3){
    return number + number2 + number3;

}
public static double add(double number, double number2){
    return number + number2;

}
public static double subtract(double number, double number2, double number3){
    return number - number2 - number3;
}
public static double subtract(double number, double number2){
    return number - number2;

}

public static double divide(double number, double number2, double number3 ){
    return number / number2 / number3;

}
public static double divide(double number, double number2){
    return number / number2;

}
public static double multiply(double number, double number2, double number3){
    return number * number2 * number3;

}
public static double multiply(double number, double number2){
    return number * number2;

}

}
