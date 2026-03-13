import java.util.Scanner;
public class TaskTwo{
    public static void main(String[]args){
    Scanner inputCollector = new Scanner(System.in);


    System.out.println("Enter a Pet Name: ");
    String name = inputCollector.nextLine();

    if (name.equalsIgnoreCase("dog")){
        System.out.println("Woof!");


}else if (name.equalsIgnoreCase("cat")){
        System.out.println("Cool Choice, but i love dogs!");
        
    } 
    else{
            System.out.println("Ops Wrong Choice!!");

}


    }
    





}
