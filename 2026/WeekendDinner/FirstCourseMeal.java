

public class FirstCourseMeal{
    public static void main(String[]args){
    
    
   for(int number = 2; number <=100; number++){
    
    int divisor = 0;
     
        for(int count = 2; count < number; count ++){
            if (number % count == 0){
                divisor++;
        }


    }

    if (divisor == 0){
        System.out.println("Number is prime Number" + number);

}else{
        System.out.println("Number is Not a Prime Number" + number);
}

}




}



}

//if number !/ number{
//    System.out.println("Number is prime");
//
//
//}
