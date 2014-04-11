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
        TwoSum twoSumClass = new TwoSum();
        int[] numbers = new int[]{0,4,3,0};
        int target = 0;
        int[] indexs = twoSumClass.twoSum(numbers, target);
        System.out.println("index1=" + indexs[0] + " ,index2=" + indexs[1]);
    }
}
