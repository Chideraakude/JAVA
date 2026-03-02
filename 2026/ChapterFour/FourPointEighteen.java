
import java.util.Scanner;
public class FourPointEighteen{
    public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    
    int miles;
    int gallons;
    int totalMiles = 0;
    int totalGallons = 0;

    System.out.println("Enter miles driven (-1 to quit): ");
    miles = scanner.nextInt();

  

    while (miles != -1){

    System.out.println("Enter the gallons used: ");
    gallons = scanner.nextInt();
    
    double milesPerGallon = (double) miles / gallons;
    System.out.printf("The miles per galone is: %.2f%n", milesPerGallon);


    totalMiles = totalMiles + miles;
    totalGallons = totalGallons + gallons;

    double combinedMilesPerGallons = (double) totalMiles / totalGallons;
    System.out.printf("The Combines Miles Per Gallon is: %.2f%n", combinedMilesPerGallons);

    System.out.println("Enter miles driven (-1 to quit): ");
    miles = scanner.nextInt();
    

}


}




}
