import java.util.Scanner;
public class NestedIfElse{
    public static void main(String[]args){

    Scanner input = new Scanner(System.in);
        System.out.print("Enter a number");
            int studentGrade = input.nextInt();




if(studentGrade >= 90){
    System.out.println("Excellent");

}
else {
    if(studentGrade >= 80){
    System.out.println("Very Good");

}
else {
    if(studentGrade >= 70){
    System.out.println("Good");
}
else{
    if (studentGrade >= 60){
    System.out.println("Passed");

}
else{
    System.out.println("Failed");
}
}
}

}

}
}
