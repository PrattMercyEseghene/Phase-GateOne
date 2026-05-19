import java.util.Scanner;
public class TaskFour{
public static void main(String[]args){
Scanner inputCollector = new Scanner(System.in);
System.out.println("Enter a number");
int digit = inputCollector.nextInt();

int number=10;
int count=0;
for(int outer = 1; outer<=number; outer++){

count++;
System.out.println(digit + "*" + count + "=" + digit * count);
}
}
}

