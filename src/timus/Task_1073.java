package timus;

import java.util.Scanner;

public class Task_1073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dp = new int[60001];
        dp[0] = 0;
        for (int i = 1; i <= N; ++i) {
            dp[i] = i + 1;
            for (int j = 1; j * j <= i; ++j)
                dp[i] = Math.min(dp[i], 1 + dp[i - j * j]);
        }
        System.out.println(dp[N]);
    }
}
