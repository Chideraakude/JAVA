import java.util.Scanner;

public class Divisible{

    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
//    String [] arr = new String [201];
   

    for(int count = 100; count < 201; count++){

if ( count % 4 == 0 && count % 6 == 0 ){
    System.out.println(""" 
                        "Hello World" """);
}


        else if ( count % 4 == 0 ){
            System.out.println(""" 
                        "Hello" """);
}
else if ( count % 6 == 0 ){
    System.out.println(""" 
                        "World" """);
}

else{
    System.out.println(count);

}


}

    





}
}
