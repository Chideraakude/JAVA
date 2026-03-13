import java.util.Scanner;
import java.util.Arrays;
//int [] numbers = {10,20,30,40,50};

//   System.out.print(numbers[2]);
public class SimpleArray{
    public static void main(String[]args){
    

Scanner userInput = new Scanner(System.in);

int [][] arr = new int [3][3];

//int [][] arr = {{1,2,3}
//                {4,5,6}       
//                {7,8,9}
//}

for (int rowIndex = 0; rowIndex < arr.length; rowIndex++){
    for (int columnIndex = 0; columnIndex < arr.length; columnIndex++){
    System.out.print("Enter number:");
    arr[rowIndex][columnIndex] = userInput.nextInt();

}

}
System.out.print(Arrays.deepToString(arr));
}
}
