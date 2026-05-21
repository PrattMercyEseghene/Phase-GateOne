import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertion.*;
public class TwoSumTest{
@Test
public void testToCheckSumOfTwoNumbersInTheArrayGetSum(){

int[] array = {8,6,12,4,-2};
int target = 8;
int expected = {8, -2};
int actual = TwoSum.getSum(array,target);
assertArrayEquals(expected, actual);
}
}
@Test
public void testToCheckSumofSecondTwoNumbersInTheArray (){

int [] array = {1,2,5,7,6,8,9};
int target = 12;
int expected = {5,7};
int actual = TwoSum.getTwoSum(array,target);
assertArrayEquals(expected,actual);
}
}
