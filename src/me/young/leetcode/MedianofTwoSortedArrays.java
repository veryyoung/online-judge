package me.young.leetcode;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: veryyoung
 * Email:codingyoung@gmail.com
 * Date: 14-4-14
 * Time: 下午8:20
 * To change this template use File | Settings | File Templates.
 */
public class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int A[], int B[]) {
        int m = A.length;
        int n = B.length;
        int sum = m + n;
        if (sum % 2 != 0)
            return findkth(A, m, B, n, sum / 2 + 1);
        else
            return ((double) findkth(A, m, B, n, sum / 2) + findkth(A, m, B, n, sum / 2 + 1)) / 2;
    }

    public int findkth(int A[], int m, int B[], int n, int k) {
        if (m > n)
            return findkth(B, n, A, m, k);
        if (m == 0)
            return B[k - 1];
        if (k == 1)
            return A[0] < B[0] ? A[0] : B[0];
        int pa = k / 2 < m ? k / 2 : m;
        int pb = k - pa;
        if (A[pa - 1] < B[pb - 1])
            return findkth(Arrays.copyOfRange(A, pa, m), m - pa, B, n, k - pa);
        else if (A[pa - 1] > B[pb - 1])
            return findkth(A, m, Arrays.copyOfRange(B, pb, n), n - pb, k - pb);
        else
            return A[pa - 1];
    }
}
