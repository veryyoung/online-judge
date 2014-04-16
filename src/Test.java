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
        MedianofTwoSortedArrays clazz = new MedianofTwoSortedArrays();
        int[] numbersA = new int[]{1, 2, 3, 4, 5};
        int[] numbersB = new int[]{100, 101, 102};
        System.out.println(clazz.findMedianSortedArrays(numbersA, numbersB));

    }
}
