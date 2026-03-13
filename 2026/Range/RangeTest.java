import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.junit.jupiter.api.Assertions.assertFalse;




public class RangeTest{


    @Test
    public void testThatLengthIsChecked(){
	
		int [] numbers = {2, 5, 7, 1, 6, 9};
		Range swapper = new Range();
		int expectedLength = swapper.getLength(numbers);
		int actualLength = 6;
		assertEquals(expectedLength, actualLength);



}

    @Test
    public void testForSecondLargest(){

        int [] numbers = {10, 5, 7, 1, 6, 9};
		Range swapper = new Range();
		int expected = 9;
		int actual = swapper.rangeOfSecondHighest(numbers);
		assertEquals(expected, actual);

    




    }

    @Test
    public void testForSecondLowest(){

        int [] numbers = {10, 5, 7, 1, 6, 9};
		Range swapper = new Range();
		int expected = 6;
		int actual = swapper.rangeOfSecondLowest(numbers);
		assertEquals(expected, actual);


    }


}
