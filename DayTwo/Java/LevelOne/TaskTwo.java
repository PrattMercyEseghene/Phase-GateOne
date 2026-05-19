import java.util.Scanner;
public class TaskTwo{
public static void main(String[]args){
Scanner inputCollector = new Scanner(System.in);
System.out.println("What is your age");
int age = inputCollector.nextInt();
age= age + 5;

System.out.println("He will be " + age  + "years old");

}
}
