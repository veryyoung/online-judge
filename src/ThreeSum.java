import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: veryyoung
 * Email:codingyoung@gmail.com
 * Date: 14-4-12
 * Time: 下午11:45
 * To change this template use File | Settings | File Templates.
 */
public class ThreeSum {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> returnArray = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> eachArray;
        int length = num.length;
        for (int i = 0; i < length; i++) {
            int target = 0 - num[i];
            int start = i + 1, end = length - 1;
            while (start < end) {
                if (num[start] + num[end] == target) {
                    eachArray = new ArrayList<Integer>(3);
                    eachArray.add(0, num[i]);
                    eachArray.add(1, num[start]);
                    eachArray.add(2, num[end]);
                    returnArray.add(eachArray);
                    start++;
                    end--;
                    while (start < end && num[start] == num[start - 1]) start++;
                    while (start < end && num[end] == num[end + 1]) end--;
                } else if (num[start] + num[end] < target) {
                    start++;
                } else {
                    end--;
                }
            }
            while (i < length - 1 && num[i] == num[i + 1]) i++;

        }
        return returnArray;
    }
}
