import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.Array;


public class SwaptaskTest{
//
//    SwapTask swapper;    
//
//    @BeforeAll
//    public void setUp(){
//        swapper = new SwapTask();
//
//
//
//
//    }

    @Test

    public void testThatLengthIsChecked(){
    
        int [] numbers = {5,7,6,3,2,4};

        SwapTask swapper = new SwapTask();

        int expectedLength = swapper.getLength();

        int actualLength = 6;

        assertEquals(expectedLength, actualLength);





    }
    
      @Test

    public void testThatLengthIsEvenOrOdd(){
    
        int [] numbers = {5,7,6,3,2,4};

        SwapTask swapper = new SwapTask();

        boolean isEven = swapper.isEven(numbers);

        int actualLength = 6;

        assertTrue(isEven);





    }

    @Test

    public void testThatGivenArrayIsSwappedWithEvenLength(){
    
        int [] numbers = {5,7,6,3,2,4};

        SwapTask swapper = new SwapTask();

        int []expectedLength = swapper.swapArrayOf(numbers);

        int actualArray = {5,7,3, 6,4, 2};

        assertEquals(expectedLength,actualLength);





    }
//










}
