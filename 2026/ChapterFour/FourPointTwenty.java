import java.util.Scanner;

public class FourPointTwenty{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    

    for(int count = 1; count <= 3; count++){
        System.out.println("Enter name of Citizen: ");
        String citizen = input.nextLine();

        System.out.println("Enter Citizen's Earnings: ");
        int earnings = input.nextInt();
        input.nextLine(); 

        if (earnings <= 30000){
            double tax = (earnings * 0.15);
            System.out.println("Your Total Tax Is: $" + tax);


}
else{
        double tax = (earnings * 0.2);
        System.out.println("Your Total Tax Is: $" + tax);
}

}


}


}



