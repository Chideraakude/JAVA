
public class PyramidTask{
    public static void main(String [] args){

int rows = 8;

    for (int count = 0; count < rows; count++){
        for (int spaces = rows - count; spaces > 1; spaces--){
System.out.print("\t");
}

int num = 1;
    for (int counter = 0; counter <= count; counter++){
        System.out.print(num + "\t");
        num = num * 3;


}

num = num / 9;
    for (int counter = 0; counter < count; counter++){
        System.out.print(num + "\t");
        num = num / 3;
    

}
    System.out.println();


}








}





}
