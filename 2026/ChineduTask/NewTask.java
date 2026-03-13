

public class NewTask{

    public static void main(String[]args){

    
    double [] userInput = {4, 6, 8};
    numeratorAndDenominator(userInput);






    }

    public static void numeratorAndDenominator(double [] userInput){

        double commonFactor = 2;

        for (int count = 0; count < userInput.length; count++){

            if(userInput[count] % commonFactor == 0){

                System.out.println("The Loweest Common Factor Is: " + userInput[count]);

            }

            

            




        }
    
    




    }

    






}
