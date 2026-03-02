import java.util.Scanner;

public class FourPointTwentyOne{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    

    for(int count = 1; count <= 10; count++){
        System.out.println("Enter a number from 1-10: ");
        int number = input.nextInt();
    
    int largest = 0;

        if (number >  largest){
            largest = number;
}

        System.out.println("The Largest: " + largest);
}
}


}

