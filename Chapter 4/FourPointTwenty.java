 import java.util.Scanner;

public class FourPointTwenty{
    public static void main(String[]args){
        Scanner chideraCollector = new Scanner(System.in);


double lowTaxRate = 0.15;
double highTaxRate = 0.20;
int taxLimit = 30000;
//count = 0;


    for (int count = 1; count <= 3; count++) {

    System.out.println("Enter Citizen Name: ");
    String name = chideraCollector.nextLine();

    System.out.println("Enter Citizen Yearly Earning: ");
    double earnings = chideraCollector.nextInt();

    double tax;    
    
    if (earnings <= taxLimit){
        tax = earnings * lowTaxRate;

} else{
        tax = (taxLimit * lowTaxRate) + ((earnings - taxLimit) * highTaxRate);


}

    System.out.printf("The Citizen's Name Is: %s", name);
    System.out.printf("The Total Tax is: $%.2f%n", tax);

}




        










}


}
