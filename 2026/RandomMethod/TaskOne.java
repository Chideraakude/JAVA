//import java.util.Scanner;
//
//public class TaskOne{
//    public static void main(String[] args) {
//
//        Scanner inputCollector = new Scanner(System.in);
//
//        System.out.println("Welcome To CHIDERA'S SCORING GRADE SYSTEM'");
//       
//
//     
//
//    int[] scores = new int[10];  
//
//
//for (int counter = 0; counter < scores.length; counter++){
//
//    System.out.printf("Enter a Score %d: ", (counter + 1));
//    scores[counter] = inputCollector.nextInt();
//
//
//   
//}
//
//
//
//
//
//
//
//}
//
//
//}


import java.util.SecureRandom;


    public class TaskOne{
    public static void main(String[] args){
    SecureRandom random = new SecureRandom();


for (int counter = 0; counter <= 20; counter++){
    int face = 1 + random.nextInt(6);
    System.out.printf("%d: ", face);

if (counter % 5 == 0){
    System.out.println();




}
}





}





}
