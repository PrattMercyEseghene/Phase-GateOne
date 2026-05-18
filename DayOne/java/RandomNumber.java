import java.util.Random;
import java.util.Scanner;
public class RandomNumber{
public static void main(String[]args){

//pick a random number between 1 to 100
//Every session should produce a different number
//Allow user up to five attempt
//Tell user if answer is higher or lower
//if user guesses correctly stop immediately
Scanner inputCollector = new Scanner(System.in);

int number = 100;
number=(int)(Math.random() * 100);

System.out.println(number);

int guessNumber;

for(number=1; number<=5;number++){

System.out.print("Guess the number");
guessNumber = inputCollector.nextInt();

if(number>5){
    break;
}
else if(guessNumber==20){

System.out.println("you got it right , your number is"+ guessNumber);
}
else if(guessNumber<20){

System.out.println("lower");
}
else if(guessNumber>20){
System.out.println("higher");
}
else{
System.out.println("you have exceeded your limit");

    break;
}
}
}
}
