import java.util.Arrays;

public class DoubleTheLengthDoubleTheValue{

    public static void main(String[]args){

    int [] numbers = {2, 5, 7, 1, 6, 9};                    System.out.println(Arrays.toString(doubleTheLengthDoubleTheValue(numbers)));



    }


    public static  int[] doubleTheLengthDoubleTheValue(int [] numbers){
        int [] arr = new int[numbers.length * 2];
        for(int count = 0; count < numbers.length; count++){
            arr [count] = numbers[count];

            for (int count = numbers[0]; count < numbers.length; count++){
                arr[count] = numbers[counter * 2];
            }

        }
        
            return arr;
    }   



}
