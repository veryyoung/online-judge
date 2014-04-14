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
        ThreeSumClosest threeSumClosestClass = new ThreeSumClosest();
        int[] numbers = new int[]{-1,2,1,-4};
        System.out.println(threeSumClosestClass.threeSumClosest(numbers,1));
    }
}
