//Write a program that collect a string word ("red", "Yellow", "Green") and the out put "Stop", "Ready" "Go" rspectively

import java.util.Scanner;
    public class TrafficLights{
        public static void main(String[] args){
            Scanner chidera = new Scanner(System.in);
                System.out.println("Enter First Light");
                        String traffic1 = chidera.next();
//                System.out.println("Enter Second Light");
//                        String traffic2 = chidera.next();
//                System.out.println("Enter Third Light");
//                        String traffic3 = chidera.next();
    if (traffic1 == "red" ){
        System.out.println("STOP");
}

    else if (traffic1 == "yellow"){
        System.out.println("GET READY");

}

   else if (traffic1 == "green"){
        System.out.println("GO");
}
        
    }

}
