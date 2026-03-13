import java.util.Scanner;
    public class TaskNine{
    public static void main(String[]args){
    Scanner chidera = new Scanner(System.in);

    for(int count = 0; count <= 3; count++){
    
    System.out.println("Enter a Color: ");
    String color = chidera.nextLine();

        if (color.equalsIgnoreCase("green")){
        System.out.println("Go!!!");

        }
        else if (color.equalsIgnoreCase("red")){
            System.out.println("Stop!!!");        

        }
        else if (color.equalsIgnoreCase("yellow")){
            System.out.println("Get Ready!!!"); 

        }
        else{
            System.out.print("Wrong input!!");
        }
    
    }
 


    }

}

