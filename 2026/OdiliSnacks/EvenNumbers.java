//  a function that collect 50 numbers and print only even numbers 

public class EvenNumbers{

    public static void main(String[]args){

        int number [] = new int [50];

        evenNumbers(number);





    }


    public static void evenNumbers(int [] number){
    
       for (int count = 1; count <= number.length; count++){
          if (count % 2 == 0){
               System.out.println("Even Number: " + count);
          }
    
      }
            
   }


   




}
