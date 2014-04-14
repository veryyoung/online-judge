import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: veryyoung
 * Email:codingyoung@gmail.com
 * Date: 14-4-12
 * Time: 上午1:18
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args) {
        FourSum fourSumClass = new FourSum();
        int[] numbers = new int[]{-3,-2,-1,0,0,1,2,3};
        ArrayList<ArrayList<Integer>> list = fourSumClass.fourSum(numbers,0);
        for(ArrayList<Integer> intList:list){
            System.out.println(intList);
        }
    }
}
