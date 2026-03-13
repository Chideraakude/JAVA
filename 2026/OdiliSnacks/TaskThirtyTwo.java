
public class TaskThirtyTwo{
    public static void main(String[]args){

    int [] numbers = new int [20];
    sumOfEven(numbers);

    




    }

    public static void sumOfEven( int [] numbers ){

    int total = 0;


        for (int count = 0; count <= numbers.length; count++){
            if(count % 2 == 0){
                System.out.println("Even Number: " + count);
                total += count;
            
            }
            

        }
        System.out.println("The Total Is: " + total);


    }



}
