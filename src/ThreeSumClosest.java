import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: veryyoung
 * Email:codingyoung@gmail.com
 * Date: 14-4-14
 * Time: 下午4:22
 * To change this template use File | Settings | File Templates.
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] num, int target) {
        int length = num.length;
        if (length < 3) return -1;
        Arrays.sort(num);
        int recordNum = num[0] + num[1] + num[2];
        int minMargin = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            int start = i + 1, end = length - 1;
            while (start < end) {
                int currentNum = num[start] + num[end] + num[i];
                if (currentNum == target) return target;
                else if (currentNum > target) {
                    if (Math.abs(target - currentNum) < minMargin) {
                        minMargin = Math.abs(target - currentNum);
                        recordNum = currentNum;
                    }
                    end--;
                } else {
                    if (Math.abs(target - currentNum) < minMargin) {
                        minMargin = Math.abs(target - currentNum);
                        recordNum = currentNum;
                    }
                    start++;
                }
            }
        }
        return recordNum;
    }
}
