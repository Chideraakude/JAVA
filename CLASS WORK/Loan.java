//Write a progran that ask the user for (1)annual income (2)years of experience (3)credit score
//conditions for eligibility: income must be greater than or equal to 350,000, credit score must be >= 650 and experience must be at leat 2 years
// Note: Loan amount is five times the income. Ig eleigible tell us "eligible" and loan amount.

import java.util.Scanner;
    public class Loan{
    public static void main(String...args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Loan Amount: ");
    int LoanAmount = input.nextInt();

    System.out.print("Enter Annual Income: ");
    int AnnualIncome = input.nextInt();

    System.out.print("Enter Years of Experience: ");
    int YearExp = input.nextInt();
    
    System.out.print("Enter Credit Score: ");
    int CreditScore = input.nextInt();

if (LoanAmount >= 1750000 && AnnualIncome >= 350000 && CreditScore >= 650 && YearExp == 2){
    System.out.printf("This user is eligible for the loan of %d", LoanAmount, (AnnualIncome * 5));
}
else 
System.out.println("This user is not eligible for a Loan");

}
}     
