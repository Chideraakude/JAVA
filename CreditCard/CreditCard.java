import java.util.Scanner;

public class CreditCard{
    public static void main(String[]args){
    Scanner inputCollector = new Scanner(System.in);
        System.out.print("Hello, kindly enter your card details to verify: ");
        String creditCard = inputCollector.nextLine();


//        int evenCredit = (4 + 4 + 8 + 2 + 3 + 1 + 7 + 8);
//        int oddCredit = (6 + 6 + 0 + 8 + 7 + 8 + 3);
//        int sum = ( evenCredit + oddCredit );
        int len = creditCard.length();

        
        if (len < 13 || len > 16){

            System.out.println("Invalid Card Length");
            return;
}

        String creditCardType = "";

        if(creditCard.startsWith("4")){
            creditCardType = "VISA CARD";

}
else if(creditCard.startsWith("5")){
            creditCardType = "MASTERCARD";


}
else if(creditCard.startsWith("37")){
            creditCardType = "AMERICAN EXPRESS";

}
else if(creditCard.startsWith("6")){
            creditCardType = "DISCOVER CARDS";
}
else{
    System.out.println("INVALID CARD!!!");
}

int sum = 0;
boolean double_Number = false;

for (int count = creditCard.length() -1; count >= 0; count--){
    int number = creditCard.charAt(count) - '0';

    if (double_Number){
        number = number * 2;
        if (number > 9) {
            number = number - 9;
        
    }


}


    sum +=  number;
    double_Number = !double_Number;



}

String validity_Status;

        if (sum % 10 == 0){
            validity_Status = "Valid";

            System.out.println("Credit Card Type: " + creditCardType);
            System.out.println("Credit Card Number: " + creditCard );
            System.out.println("Credit Card Length: " + len);
            System.out.println("Credit Card Validity Staus: " + validity_Status);


}
        else{
            validity_Status = "Invalid";
            System.out.println("Credit Card Type: " + creditCardType);
            System.out.println("Credit Card Number: " + creditCard );
            System.out.println("Credit Card Length: " + len);
            System.out.println("Credit Card Validity Staus: " + validity_Status);


}
            
        inputCollector.close();





}






}
