


import java.util.Scanner;

public class semicolon_Checkout{
    public static void main(String[]args){
    Scanner inputCollector = new Scanner(System.in);
    System.out.println("Welcome To Semicolon Store");



double total_Price = 0;
double vat;
double discount = 0;
//semicolon_Cart = " ";

 System.out.println("What is the customer's Name?: ");
    String customerName = inputCollector.nextLine();

while (true){

    System.out.println("What is the Product Name: ");
    String product_Name = inputCollector.nextLine();

    System.out.println("Number of Quantities: ");
    int no_Of_Quantity = inputCollector.nextInt();

    System.out.println("What is the Product Price: ");
    double product_Price = inputCollector.nextDouble();

    inputCollector.nextLine();


    double total_Item = product_Price * no_Of_Quantity;
    total_Price += total_Item;

    System.out.println("The Total Item is: $" + total_Item);

    System.out.print("Do You Want To Add another product? (yes/no): ");
    String response = inputCollector.nextLine();

    if (response.equalsIgnoreCase("no")) {
        break;

}
    
}    

    vat = total_Price * 0.075;

    if(total_Price >= 10000){
        discount = total_Price * 0.05;
    
}

    double final_Amount = total_Price - discount + vat;

    System.out.println("\n -CUSTOMER INVOICE-");
    System.out.println("The Total Price" + total_Price);
    System.out.println("You Have a Discount of: $" + discount);
    System.out.println("VAT (7.5%): $" + vat);
    System.out.println("You are Paying: $" + final_Amount);

    System.out.println("\n Thank You For Shopping With Us!!");

    inputCollector.close();
}

}

