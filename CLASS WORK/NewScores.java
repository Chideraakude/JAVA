import java.util.Scanner;
    public class NewScores{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.println("Scores");
    int Score1 = input.nextInt();
    int Score2 = input.nextInt();
    int Score3 = input.nextInt();
    int Score4 = input.nextInt();
    int Score5 = input.nextInt();
    int sum = (Score1 + Score2 + Score3 + Score4 + Score5);
    int ave = (sum/5);

if (ave >= 70){
    System.out.println("This is Excellent");
}
else if(ave >= 60){
    System.out.println("This is Very Good");
}
else if(ave >= 45){
    System.out.println("This is Good");
}
else
    System.out.println("This Needs Improvement");

    }
}
