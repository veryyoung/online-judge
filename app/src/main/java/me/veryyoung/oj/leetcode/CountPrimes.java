package me.veryyoung.oj.leetcode;


public class CountPrimes {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        boolean[] isPrimes = new boolean[n];
        for (int i = 2; i < isPrimes.length; i++) {
            isPrimes[i] = true;
        }
        for (int i = 2; i * i < n; i++) {
            if (!isPrimes[i]) {
                continue;
            }
            for (int j = i; i * j < n; j++) {
                isPrimes[j * i] = false;
            }
        }
        
        int primesCount = 0;
        for (boolean isPrime : isPrimes) {
            if (isPrime) {
                primesCount++;
            }
        }
        return primesCount;
    }
}
