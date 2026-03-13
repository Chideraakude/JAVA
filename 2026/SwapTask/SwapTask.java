

public class SwapTask{
    
    public int getLength(int [] numbers){

        return numbers.length;








    }
    public boolean isEven(int [] numbers){

        return getLength(numbers)% 2  == 0;








    }
    public int [] swapArrayOf(int [] numbers){
        
        int lengthOfArray = 0;

        if(isEven(numbers))lengthOfArray = getLength(numbers);
        else lengthOfArray = getLength(numbers)-1; 

        for(int index = 0; index < numbers.length; index+=2){
            int temp = numbers[index];

            numbers[index] = numbers[index + 1];

            numbers[index + 1] = temp;



        }


            return numbers;





    }


//    public void SwapNumbers(int [] numbers);
//
//    for(count = 1; count <= numbers.length; count++ );
//
//    int tempNum = 
//





}
