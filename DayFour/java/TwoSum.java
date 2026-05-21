public class TwoSum{

public static void main(String[]args){


}

public static int[] getSum(int[]array, int target){

int [] number = new int [2];

for(int index = 0; index<array.length; index++){

for(int count = index + 1; count<array.length; count++){

if(array[index] + array[count]==target){
    number[0] = array[index];
    number[1] = array[count];
}
}
}
return number;
}
}

public static int[] getTwoSum(int[]array, int target){

int[]result =new int[2];

for(int index = 0; index<array.length; index++){

for(int counter= index; counter<array.length;counter++){

if(array[index] + array[counter]==target){

result[3] = array[index];
result[2] = array[counter];

}
}
}
return result;
}
}


