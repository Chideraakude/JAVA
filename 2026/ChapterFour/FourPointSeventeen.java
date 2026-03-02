

import java.util.Scanner;
    public class FourPointSeventeen{
    public static void main(String[]args){

    Scanner inputCollector = new Scanner(System.in);
    System.out.println("Enter Account Number: ");
    int accountNumber = inputCollector.nextInt();

    System.out.println("Enter opening account balance: ");
    int openingBalance = inputCollector.nextInt();

    System.out.println("Enter total charges: ");
    int totalCharge = inputCollector.nextInt();

    System.out.println("Enter total credit: ");
    int totalCredits = inputCollector.nextInt();

    System.out.println("Enter credit limit: ");
    int creditLimit = inputCollector.nextInt();

    int newBalance = (openingBalance + totalCharge + totalCredits);
    System.out.println("Hello Your Account Number Is: " accountNumber);
    System.out.println("The new available balance is: " + newBalance);

    if (newBalance < creditLimit){
        System.out.println("Credit Limit Not Exceeded");

}else{
        
        System.out.println("Credit Limit Exceeded");
}

    



}



}
