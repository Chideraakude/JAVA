import java.util.Scanner;

public class MiniCalculator1{
public static void main(String[]args){
System.out.println(add(1,2));
System.out.println(add(1,2,3));

System.out.println(subtract(1,2));
System.out.println(subtract(1,2,3));

System.out.println(divide(1,2));
System.out.println(divide(1,2,3));

System.out.println(multiply(1,2));
System.out.println(multiply(1,2,3));
//System.out.println(add(1,2,3,4));



}

public static int add(int num1, int num2){
    return number + number2;

}
public static int add(int num1, int num2, int num3){
    return number + number2;

}
public static int add(int num1, int num2, int num3){
    return number + number2 + number3;

}
public static double subtract(double number, double number2){
    return number - number2;

}
public static double subtract(double number, double number2, double number3){
    return number - number2 - number3;

}
public static double divide(double number, double number2){
    return number / number2;

}
public static double divide(double number, double number2, double number3){
    return number / number2 / number3;

}
public static double multiply(double number, double number2){
    return number * number2;

}
public static double multiply(double number, double number2, double number3){
    return number * number2 * number3;

}

}
