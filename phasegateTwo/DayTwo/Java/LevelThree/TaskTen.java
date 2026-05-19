public class TaskTen{
public static void main(String[]args){

String word = "number";
String letter = " ";

for(int index = word.length()-1; index>=0; index--){

letter += word.charAt(index);

}
System.out.println(word.length());
}
}
