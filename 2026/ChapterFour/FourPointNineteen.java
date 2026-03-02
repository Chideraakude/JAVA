

import java.util.Scanner;

public class FourPointNineteen{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    for (int count = 1; count <= 4; count++){

    System.out.println("Enter the item sold for last week: ");
    double value = input.nextDouble();

    int salary = 200;
    double commission = value * 0.09;
    double totalSalary = salary + commission;

    System.out.println("The Sales Persons Earning is: $" + totalSalary);

}


}


}
