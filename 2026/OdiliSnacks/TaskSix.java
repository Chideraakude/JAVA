



public class TaskSix{
    public static void main(String[]args){

    int number [] = new int [15];
    multiplesOfThree(number);


    }

    public static void multiplesOfThree(int [] number){
        for (int count = 1; count <= number.length; count++){
            if (count % 3 == 0){
                System.out.println("Multiples of Three: " + count);

            

            }
            
        }



    }


    
    





}
