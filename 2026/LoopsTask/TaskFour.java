//4444444
//4333334
//4322234
//4321234
//4322234
//4333334
//4444444



//public class TaskFour{
//    public static void main(String[]args){
//
//
//int row = 7;
//int largestNumber = 4;
//int size = 2 * largestNumber - 1;
//
//
//
//    for (int count = 0; count < size; count++){
//          for (int counter = 0; counter < size; counter++){
//
//int top = count;
//int left = counter;
//int right = size - 1 - counter;
//int bottom = size - 1 - count;
//int value = largestNumber - Math.min(Math.min(top, bottom), Math.min(left, right));
//
//
//
//
//
//
//            System.out.print(value + " ");
//
//
//}
//System.out.println();
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
//}
//
//
//
//
//}





































public class TaskFour{
    public static void main(String[]args){

 int largestNumber = 4;

for (int count = largestNumber; count >= 1; count--){
    for(int counter = largestNumber; counter >= 1; counter--){
        if (counter <= count)
            System.out.print(count + " ");
        else
            System.out.print(counter + " ");

}
     for(int counter = 2; counter <= largestNumber; counter++){
        if (counter <= count)
            System.out.print(count + " ");
        else
            System.out.print(counter + " ");

}

    System.out.println();

}


for (int count = 2; count <= largestNumber; count++){
    for(int counter = largestNumber; counter >= 1; counter--){
        if (counter <= count)
            System.out.print(count + " ");
        else
            System.out.print(counter + " ");

}
     for(int counter = 2; counter <= largestNumber; counter++){
        if (counter <= count)
            System.out.print(count + " ");
        else
            System.out.print(counter + " ");

}

    System.out.println();

}




}


}










