import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewTastTest{

    @Test
    public  void testThatCommonFactorIstwo(){

     double [] userInput = {4, 6, 8};
     double actualValue = NewTask.numeratorAndDenominator(userInput);
     double expectedValue = 2;
     assertEquals (expectedValue, actualValue);






    }






}
