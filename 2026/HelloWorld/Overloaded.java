import java.util.Scanner;

public class Overloaded{
public static void main(String[]args){
System.out.println(add(1,2));
System.out.println(add(1,2,3));
System.out.println(add(1,2,3,4));



}

public static int add(int num1, int num2){
    return num1 + num2;

}
public static int add(int num1, int num2, int num3){
    return num1 + num2 + num3;

}
public static int add(int num1, int num2, int num3, int num4){
    return num1 + num2 + num3 + num4;

}

}
