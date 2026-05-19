import java.util.Scanner;
public class TaskSix{
public static void main(String[]args){
Scanner inputCollector = new Scanner(System.in);
System.out.println("Enter length");
double length = inputCollector.nextDouble();
System.out.println("Enter width");
double width = inputCollector.nextDouble();

double Area = length * width;

System.out.println(Area);
}
}
