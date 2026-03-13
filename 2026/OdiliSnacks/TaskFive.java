



public class TaskFive{
    public static void main(String[]args){

    int number [] = new int [10];
    eveAndOddNumbers(number);


    }

    public static void eveAndOddNumbers(int [] number){
        for (int count = 1; count <= number.length; count++){
            if (count % 2 == 0){
                System.out.println("Even Numbers: " + count);

            

            }
            else{
                 System.out.println("Odd Numbers: " + count);
            
            }



        }



    }


    
    





}
