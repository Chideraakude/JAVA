import java.util.Scanner;

public class WorkingBreak{
    public static void main(String[]args){
    Scanner inputCollector = new Scanner(System.in);
    
    System.out.println("+, -, /, * : ");
    String operation = inputCollector.nextLine();

  
for (double number = 0; number <= 2; number++){
    System.out.println("Enter a Number: ");
    number = inputCollector.nextDouble();
    double number2 = inputCollector.nextDouble();

    double answer;
    switch (operation){
    case "+":
        answer = add(number, number2);
        break;
    case "-":
        answer = subtract(number,  number2);
        break;
    case "/":
        answer = divide(number, number2);
        break;
    case "*":
        answer = multiply(number, number2);
    case "_":
        System.out.print("This is not a math operator!! Try Again");
        return;
}


System.out.println("The Answer: " + "answer");

}
//    String number2 = inputCollector.nextLine();


}

public static double add(double number, double number2){
    return number + number2;

}
public static double subtract(double number, double number2){
    return number - number2;

}
public static double divide(double number, double number2){
    return number / number2;

}
public static double multiply(double number, double number2){
    return number * number2;

}


}
