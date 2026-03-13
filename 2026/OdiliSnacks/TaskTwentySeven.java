public class TaskTwentySeven{
    public static void main(String[]args){
    
    int [] numbers = new int [20];
    multiplesOfThreeAndFive(numbers);
  

    }

    public static void multiplesOfThreeAndFive(int [] numbers){
        for(int count = 1; count <= 20; count++){
            if(count % 3 == 0 && count % 5 == 0){
                System.out.println(count);
            }
        }

    }

}
