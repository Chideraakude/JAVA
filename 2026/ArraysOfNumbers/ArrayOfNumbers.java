
import java.util.Arrays;

public class ArrayOfNumbers{

    public static void main(String[]args){

    int [] numbers = {2, 5, 7, 1, 6, 9};
   System.out.println(Arrays.toString(evenOrOdd(numbers)));
    




    }


    public static  boolean[] evenOrOdd(int [] numbers){
        boolean [] arr = new boolean[numbers.length];
        for(int count = 0; count < numbers.length; count++){

            if(numbers [count] % 2 == 0){
                arr [count] = true;
//            return true;
            }     
            else{
                arr [count] = false;
                }       

        }
//            return false;
            return arr;
    }



}
