import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiniStatisticsAppTest{

    @Test
    public void testThatTheMeanIsChecked(){
    
        double [] numbers = {2, 4, 4, 4, 5};
        double actualMean = MiniStatisticsApp.calculateMean(numbers);
        double expectedExpected = 3.8;
        assertEquals (expectedExpected, actualMean);







    }
    @Test
    public void testThatVarianceIsChecked(){

    double [] numbers = {2, 4, 4, 4, 5};
    double mean = MiniStatisticsApp.calculateMean(numbers);
    double actualVariance = MiniStatisticsApp.calculateVariance(numbers, mean);
    double expectedVariance = 0.98;
    assertEquals (expectedVariance, actualVariance);
    
    




    }







}
