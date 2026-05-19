public class TaskOne{
public static void main(String[]args){


System.out.println(add(4,5));

System.out.println(getEven(10));

System.out.println(getSquare(5));
System.out.println(getFahrenheit(4));
System.out.println(getPrime(7));
System.out.println(largestNumber(8,9,19));
System.out.println(getInterest(5,10,6));
System.out.println(getArea(3,2));
int b = 123456;

System.out.println(getreverse(b));


}

public static int add(int num1, int num2){

int add = num1 + num2;

return add;

}

public static boolean getEven(int num){

if(num % 2==0){

return true;

}return false;
}

public static int getSquare(int num){

int getSquare = num * num;

return getSquare;
}


public static double getFahrenheit(int celcuis){
double sum = celcuis * 1.8;
double fahrenheit = sum + 32;
return fahrenheit;
}

public static boolean getPrime(int num){
boolean prime = false;

for(int outer = 2; outer<=num; outer++){

int count = 0;
for(int inner = 1; inner<=outer; inner++){
if(num%outer !=0){

prime= true;
}
}
}
return prime;
}

public static int largestNumber(int a,int  b, int c){
int largestNumber = a;
if(b>largestNumber){

largestNumber= b;
}
if(c > largestNumber){

largestNumber=c;
}
return largestNumber;
}


public static double getInterest(int principal, int rate, int time){
double result = principal * rate * time/100;

return result;
}


public static int getArea(int length, int width){

int area = length * width;

return area;

}

public static int getReverse( int b){

int a = 123456;

int reversed = 0;

while(a!=0){

int digit = a % 10;
reversed = reversed * 10 + digit;

a = a/10;
   
} return reversed;
}

































