import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class NumberSumTest{

    @Test
    public void testNumberIsEqual(){
        int actual = NumberSum.sumOfNumbers(10, 20);
        int expected = 30;

        assertEquals(actual, expected);


    }
    @Test 
    public void testNumberIsEven(){
        boolean actual = NumberSum.evenNumber(30);

        assertTrue(actual);    


    }
     @Test 
    public void testNumberIsNotEven(){
        boolean actual = NumberSum.evenNumber(31);

        assertFalse(actual);    


    }



}
