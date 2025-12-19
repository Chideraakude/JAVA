
import java.util.Scanner;

public class FourPointOneNine{

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

int minimumPay = 200;
double commissionRate = 0.09;
double totalSales = 0.0;

int item;
double itemValue = 0.0;

System.out.println("Enter item sold (1-4) or 0 to end");
item = input.nextInt();


while (item != 0){

    if (item == 1){
        itemValue = 238.99;

}else if(item == 2){
        itemValue = 129.75;


}else if(item == 3){
        itemValue = 99.95;


}else if(item == 4){
        itemValue = 350.89;


}
else{
    System.out.println("Invalid Item Number");
        itemValue = 0.0;


}

    totalSales += itemValue;
    System.out.println("Enter item sold (1-4) or 0 to end");

    item = input.nextInt();


}


double commission = totalSales * commissionRate;
double salary = minimumPay + commission;

System.out.printf("Total Sales: $%.2f%n", totalSales);
System.out.printf("Total Salary: $%.2f%n", salary);










}

}
