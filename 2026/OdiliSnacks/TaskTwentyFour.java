

public class TaskTwentyFour{
    public static void main(String[]args){

    int [] number = new int [10];
    
    evenNumberChecker(number);

    
  
    }

    public static void evenNumberChecker(int [] numbers){
        for (int count = 1; count <= 10; count++){
            if (count % 2 == 0){

                System.out.println(count);
    }
            }
            System.out.println();
        
        }

}
