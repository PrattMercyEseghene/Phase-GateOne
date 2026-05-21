public class SmallestToLargest{
public static int getLargest(int[]array){

int Largest = array[0];

for(int index = 0; index<array.length;index++){
    if(array[0]> Largest){
    
    Largest = array[0];
        
}
}
Return Largest;
}
public static int getSmallest(int[]array){

int Smallest=array[0];

for(int count = 0; count<array.length;index++){

if(array[0]< Smallest){

Smallest = array[0];
}
}
Return Smallest;
}
}
