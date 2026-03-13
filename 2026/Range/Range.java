
public class Range{
    public static void main(String[]args){

    int [] numbers = {10, 7, 8, 1, 6, 9};

    

    System.out.println("Second Largest: " + rangeOfSecondHighest(numbers));




    }

    public int getLength(int[] numbers){
		return numbers.length;


	}




    public static int rangeOfSecondHighest(int [] numbers){

           int largest = numbers [0];
           int secondLargest = numbers [1];


            for(int count = 2; count < numbers.length; count++){

                if (numbers[count] > largest){
                    secondLargest = largest;
                    largest = numbers[count];

                } else if (numbers[count] > secondLargest){

                    secondLargest = numbers[count];

                }

            }
            return secondLargest;



    }

    public static int rangeOfSecondLowest(int[]numbers){

        int lowest = numbers[0];
        int secondLowest = numbers[1];

        for (int count = 2; count < numbers.length; count++){
            if (numbers[count] < lowest){
                secondLowest = lowest;
                lowest = numbers[count];
            }
            else if (numbers[count] < secondLowest){

                    secondLowest = numbers[count];
            }

        }
        
        return secondLowest;

    }






}
