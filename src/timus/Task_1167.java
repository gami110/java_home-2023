package timus;

import java.util.Scanner;
import java.util.Arrays;

public class Task_1167 {
    static int[] black;
    static int[][] memo;

    static int solve(int k, int n) {
        if (k == 0) return black[n] * (n - black[n]);
        int ret = memo[k][n];
        if (ret == -1) {
            for (int i = 1; n - i >= k - 1 && i <= n; ++i) {
                int aux = (black[n] - black[n - i]) * (i - black[n] + black[n - i]) + solve(k - 1, n - i);
                if (ret == -1 || aux < ret) ret = aux;
            }
            memo[k][n] = ret;
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), K = sc.nextInt();
        black = new int[N + 1];
        memo = new int[K][N + 1];
        for (int i = 0; i <= K - 1; ++i) Arrays.fill(memo[i], -1);
        black[0] = 0;
        for (int i = 0, x; i < N; ++i) {
            x = sc.nextInt();
            black[i + 1] = black[i];
            if (x == 1) ++black[i + 1];
        }
        System.out.println(solve(K - 1, N));
    }
}
