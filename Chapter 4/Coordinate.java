import java.util.Scanner;

public class Coordinate{
    public static void main(String...args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the X Coordinate: ");
    float coordinateX = input.nextFloat();

    System.out.print("Enter the Y Coordinate: ");
    float coordinateY = input.nextFloat();

    System.out.print("Enter the Second Coordinate of X: ");
    float coordinateX2 = input.nextFloat();

    System.out.print("Enter the Second Coordinate of Y: ");
    float coordinateY2 = input.nextFloat();

if(coordinateX == coordinateX2){
    System.out.println("The two point are located in a line perpendicular to the X-axis");

}else if (coordinateY == coordinateY2){
    System.out.println("The two point are located in a line perpendicular to the Y-axis");


}else{
    System.out.println("The two point are not located in a line perpendicular to either X or the Y axis");

}


}



}
