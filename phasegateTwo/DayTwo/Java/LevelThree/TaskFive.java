import java.util.Scanner;
public class TaskFive{
public static void main(String[]args){
Scanner inputCollector = new Scanner(System.in);
System.out.println("Enter a number");
int number = inputCollector.nextInt();


int factorial = 1;
for(int count=1; count<=number; count++){

factorial = factorial * count;
}
System.out.println(factorial);
}
}
