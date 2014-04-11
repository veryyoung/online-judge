import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: veryyoung
 * Email:codingyoung@gmail.com
 * Date: 14-4-12
 * Time: 上午12:48
 * To change this template use File | Settings | File Templates.
 */
public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int length = numbers.length;
        if (length < 2) return null;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] returnNums = new int[2];
        for (int i = 0; i < length; i++) {
            if (!map.containsKey(numbers[i])) {
                map.put(target - numbers[i], i);
            }
            if (map.containsKey(numbers[i])) {
                int index = map.get(numbers[i]);
                if (index < i) {
                    returnNums[0] = index + 1;
                    returnNums[1] = i + 1;
                }
            }
        }
        return returnNums;
    }
}
