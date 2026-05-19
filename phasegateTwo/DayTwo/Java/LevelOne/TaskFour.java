import java.util.Scanner;
public class TaskFour{
public static void main(String[]args){
Scanner inputCollector = new Scanner(System.in);
System.out.println("Enter firstnumber");
int firstnumber = inputCollector.nextInt();
System.out.println("Enter secondnumber");
int secondnumber = inputCollector.nextInt();
int product = firstnumber * secondnumber;

System.out.println("The product is"+ product);
}
}
