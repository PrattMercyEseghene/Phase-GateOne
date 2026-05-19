import java.util.Scanner;
public class TaskSeven{
public static void main(String[]args){
Scanner inputCollector = new Scanner(System.in);

int integer=5;
int count =0;
int sum=0;

for(int number = 1; number<=integer; number++){

System.out.println("Enter a number");
 int numbers = inputCollector.nextInt();

sum+=count;
count++;

}
System.out.println(sum);
}
}
