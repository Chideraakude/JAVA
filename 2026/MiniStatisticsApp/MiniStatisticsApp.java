

public class MiniStatisticsApp{

    public static void main(String[]args){

    double [] numbers = {2, 4, 4, 4, 5};

    double mean = calculateMean(numbers);
    double variance = calculateVariance(numbers, mean);
    double standardDeviation = calculateStanDardDeviation(variance);

    System.out.println("The Mean: " + mean);
    System.out.println("The Variance Is: " + variance);
    System.out.println("The Standard Deviation Is: " + standardDeviation);

    }

    public static double calculateMean(double [] numbers){
        double sum = 0;

        for (int count = 0; count < numbers.length; count++){

        sum += numbers[count];       


        }

        return sum / numbers.length;

    }

    public static double calculateVariance(double [] numbers, double mean){
        double sum = 0;

        for (int count = 0; count < numbers.length; count++){

        sum += Math.pow(numbers[count] - mean, 2);       


        }

        return sum / numbers.length;

    }
     public static double calculateStanDardDeviation(double variance){
      
        return Math.sqrt(variance);

    }

}



