import java.util.Scanner;
public class TaskSeventeen{
    public static void main(String[]args){
    
        int temperature = 25;

        while (true){
            Scanner input = new Scanner(System.in);

            System.out.println("Enter The temperature: ");
            temperature = input.nextInt();

            if (temperature >= 30){
                System.out.println("Hot!");
            }
            else if (temperature < 15){
                System.out.println("Cold");
            }
            else{
                System.out.println("Nice");
            }
           break;





        }
        
    }

}

