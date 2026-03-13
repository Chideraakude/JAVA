import java.util.Scanner;
public class TaskNineteen{
    public static void main(String[]args){
    
        int magicNumber = 42;

        while (true){
            Scanner input = new Scanner(System.in);

            System.out.println("Enter a Magic Number: ");
            magicNumber = input.nextInt();

            if (magicNumber == 42){
                System.out.println("You found the magic number");
                break;


            }
            else{
                System.out.println("Keep Looking");
            }
           
                




        }
        
    }

}

