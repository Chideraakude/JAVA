//Arrays of Arrays

import java.util.Scanner;
import java.util.Arrays;

public class ArraysofArray{



public static void main(String[]args){

    int[] [] matrix = { 
                {1,2,3}, 
                { 4,5,6,10 }, 
                {7,8,9} 



                };



for(int rowIndex = 0; rowIndex < matrix.length; rowIndex++){

    System.out.print("Row" + rowIndex + ":");

for(int columnIndex = 0; columnIndex < matrix[rowIndex].length; columnIndex ++){

    System.out.print(matrix[rowIndex][columnIndex] + "");    


}
    System.out.println();
}
}
}
