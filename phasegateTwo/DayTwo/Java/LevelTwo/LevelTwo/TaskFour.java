import java.util.Scanner;
public class TaskFour{
public static void main(String[]args){
Scanner inputCollector = new Scanner(System.in);
System.out.println("Enter numberone");
int numberone = inputCollector.nextInt();

System.out.println("Enter numbertwo");
int numbertwo = inputCollector.nextInt();


if(numberone>numbertwo){

System.out.println("larger number is" + numberone);

}
else if(numbertwo>numberone){

System.out.println("larger number is" + numbertwo);
}
else{
System.out.println("none");
}
}
}






