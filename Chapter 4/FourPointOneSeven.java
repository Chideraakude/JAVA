import java.util.Scanner;

public class FourPointOneSeven{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	

	for( int drive = 1; drive <= 3; drive++){

	System.out.print("Enter miles driven: ");
	int miles = input.nextInt();

	System.out.print("Enter gallon used: ");
	int gallon = input.nextInt();

	float total = miles/gallon;

	System.out.printf("the gallon per miles is: %.2f%n", total);

	}


}
}
