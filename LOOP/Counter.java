//write a code that add 1 to 1000

import java.util.Scanner;
public class Counter{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
//        System.out.println("My Counter");
//        int Counter = input.nextInt();
int sum = 0;
for (int counter = 0; counter <= 1000; counter++){
    sum += counter;

}

System.out.println(sum);


}
    
}
