import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyFirstTest {

    @Test
    public void additionMethodTest() {
        long input1 = 20;
        long input2 = 30;
        long expected = 50;
        assertEquals(expected, MathOperations.addMethod(input1, input2));
    }

    @Test
    public void tipAppTest(){
        double cost = 22.56;
        double tip = 20;
        double expected = 4.51;
        assertEquals(expected, MathOperations.tip(cost, tip), 0.01);
    }

    @Test
    public void testArrayEquality(){
        int[] startArray = {1, 2, 3, 4, 5};
        int[] endArray = {2, 3, 4, 5, 6};
        assertArrayEquals(endArray, MathOperations.addOneToArray(startArray));
    }
}
