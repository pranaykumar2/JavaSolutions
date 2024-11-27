package com.TCSNQT;


public class CuttingRod {

    public static int cutRod(int prices[], int n)
    {
        if (n <= 0) {
            return 0;
        }
        int[] dp = new int[prices.length + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] = Math.max(dp[i], prices[j - 1] + dp[i - j]);
            }
        }
        return dp[n];
    }
    public static void main(String[] args)
    {

        int prices[] = new int[] {1,4,2,5,6};
        int n = prices.length;

        System.out.println("Maximum obtained value is " + cutRod(prices, n));
    }
}