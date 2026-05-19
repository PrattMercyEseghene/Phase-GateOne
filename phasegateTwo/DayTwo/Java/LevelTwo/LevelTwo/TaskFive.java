import java.util.Scanner;
public class TaskFive{
public static void main(String[]args){
Scanner inputCollector = new Scanner(System.in);
System.out.println("Enter numberone");
int numberone = inputCollector.nextInt();

System.out.println("Enter numbertwo");
int numbertwo = inputCollector.nextInt();
System.out.println("Enter numberthree");
int numberthree = inputCollector.nextInt();

if(numberone>numbertwo){

System.out.println("larger number is" + numberone);

}
else if(numberone < numbertwo){

System.out.println("larger number is" + numbertwo);
}
else if(numberthree > numbertwo){
System.out.println("larger number is" + numberthree);
}
else if(numberthree < numbertwo){

System.out.println("larger number is"  + numbertwo);
}
}
}
