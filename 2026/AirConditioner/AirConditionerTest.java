import org.junit.jupiter.api.Test;
//
import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import static org.junit.jupiter.api.Assertions.assertThrows;
//
//import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import static org.junit.jupiter.api.Assertions.assertTrue;






public class AirConditionerTest{

    @Test
    public void acCanTurnOn(){

        AirConditioner airCondition = new AirConditioner();
        boolean expected = true;
        boolean actual =  airCondition.turnOnAc();
	    assertEquals(expected, actual);

     


    }

    @Test
    public void acCanTurnOff(){
    
        AirConditioner airCondition = new AirConditioner();
        boolean expected = false;
        boolean actual = airCondition.turnOffAc();
        assertEquals(expected, actual);




    }

    @Test
    public void acCanBeIncreased(){
    
        AirConditioner airCondition = new AirConditioner();
        int expected = 17;
        int actual = airCondition.increaseAirconditionTemperature();
        assertEquals(expected, actual);



    }
    
    @Test
    public void acCanBeDecreased(){

        AirConditioner airCondition = new AirConditioner();
        int expected = 16;
        int actual = airCondition.decreaseAirconditionTemperature();
        assertEquals(expected, actual);
      




    }
    
    @Test
    public void acCannotBeIncreasedAboveThirthy(){

        AirConditioner airCondition = new AirConditioner();

        for (int count = 1; count <= 30; count++){
        

        }
        int actual = airCondition.getTemperature();
        int expected = 16;
        assertEquals(expected, actual);




    }

    @Test
    public void acCannotBeDecreasedBelow16(){

        AirConditioner airCondition = new AirConditioner();

        for (int count = 1; count >= 30; count--){
        

        }
        int actual = airCondition.getTemperature();
        int expected = 16;
        assertEquals(expected, actual);




    }
    
    





}
