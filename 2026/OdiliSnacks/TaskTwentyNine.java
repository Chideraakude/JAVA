import java.util.Scanner;
public class TaskTwentyNine{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a word: ");
    String word = input.next();

    int totalCount = 0;

    for (int count = 0; count < word.length(); count++){

        char letter = word.charAt(count);


        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'
             || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U'){
            totalCount++;
            
        }
    }
    System.out.println("Number of Vowels: " + totalCount);
    }

}
