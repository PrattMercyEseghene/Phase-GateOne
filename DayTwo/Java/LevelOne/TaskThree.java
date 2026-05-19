import java.util.Scanner;
public class TaskThree{
public static void main(String[]args){
Scanner inputCollector = new Scanner(System.in);
System.out.println("Enter  firstnumber");
int firstnumber = inputCollector.nextInt();
System.out.println("Enter secondnumber");
int secondnumber = inputCollector.nextInt();
int sum = firstnumber + secondnumber;

System.out.print("The sum is " + sum);
}
}
