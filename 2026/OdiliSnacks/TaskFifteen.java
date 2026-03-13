import java.util.Scanner;
public class TaskFifteen{
    public static void main(String[]args){
    
        String myAnimal = "dog";

        while (true){
            Scanner input = new Scanner(System.in);

            System.out.println("Guess The Animal: ");
            myAnimal = input.nextLine();

            if (myAnimal.equalsIgnoreCase("Dog")){
                System.out.println("Correct! It's a dog");
                break;


            }
            else{
                System.out.println("Nope, It's a dog");
            }
           





        }
        
    }

}

