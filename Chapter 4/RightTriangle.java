//number = 1
//
//while number <= 10:
//    print(number * "*")
//   number = number + 1

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
    Scanner deraCollector = new Scanner(System.in);


    System.out.print("Enter a number: ");
    int number = deraCollector.nextInt();

//        int number = 1;

        if (number < 1 || number > 10) {
        System.out.println("Invalid imput!!!");

        }
        else{
            for (int counter = 1; counter <= number; counter++) {
                for (int asterik = 1; asterik <= counter; asterik++){
        System.out.print("*");
            }        

        System.out.println();
//            number++;
            }

          
        }
    }
}

