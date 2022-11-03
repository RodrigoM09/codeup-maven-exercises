import java.util.ArrayList;

public class MathOperations {

    ArrayList<Integer> arrayList = new ArrayList<>();
    ArrayList<Integer> arrayList2 = new ArrayList<>();

//    @Before
//    public void setUpValues(){
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList2.add(1);
//        arrayList2.add(2);
//    }
//    @Test
//    public void testObjectEquality(){
//        assertSame(arrayList, arrayList2);
//    }


    public static long addMethod(long input1, long input2) {
        return input1 + input2;
    }
    public static double tip(double cost, double tip){
        return cost * (tip / 100);
    }

    public static int[] addOneToArray(int[] startArray){
        int[] endArray = new int[startArray.length];
        for (int i = 0; i < startArray.length; i++) {
            endArray[i] = startArray[i] + 1;
        }
        return endArray;
    }

}
