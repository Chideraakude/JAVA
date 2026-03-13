import java.util.Scanner;
public class ClassTeacher{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a Number: ");
    int number1 = input.nextInt();

    System.out.println("Enter Another Number: ");
    int number2 = input.nextInt();

int count = 0;
  
    for (; number1 >= number2;){
            count++;
     number1 = number1 - number2;
        

        

}

System.out.println(count);


}




}
