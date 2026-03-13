


public class AirConditioner{

    public boolean acIsOn = false;
    public static int temperature = 16;


    public boolean turnOnAc(){

        acIsOn = true;
        return acIsOn;



    }
    public boolean turnOffAc(){

        acIsOn = false;
        return acIsOn;



    }
    public boolean acIsOn(){
        return acIsOn;



    }

    public static int increaseAirconditionTemperature(){
        

        if(temperature < 30){
            temperature++;
            
        }
        return temperature;


    }

    public static int decreaseAirconditionTemperature(){
        

        if(temperature > 16){
            temperature--;
            
            
        }
        return temperature;


    }

    public static int getTemperature(){
        return temperature;


    }


    

}
