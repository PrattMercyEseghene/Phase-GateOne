import java.util.Scanner;
public class TaskFive{
public static void main(String[]args){
Scanner inputCollector = new Scanner(System.in);
System.out.println("Enter a temperature");
double temperature = inputCollector.nextInt();
double multiply= temperature * 1.8;
double sum = multiply + 32;
System.out.println(sum);
}
}
