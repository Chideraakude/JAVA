//A class of ten students took a quiz. The grades (integers in the range 0–100) for this quiz are available to you. Determine the class average on the quiz.
import java.util.Scanner;
public class WhileLoop{
    public static void main(String[]args){
        Scanner inputCollector = new Scanner(System.in);



int total = 0;
int gradeCounter = 1;

while (gradeCounter <= 10){

    System.out.print("Enter the next grade: ");
    int grade = inputCollector.nextInt();



    total = total + grade;
    gradeCounter = gradeCounter +1;
}


    double average = total/10.0;
System.out.printf("The Class average is %d%n: ",total);
System.out.printf("The Class average is %.2f%n: ",average);




}




}


