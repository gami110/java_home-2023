package timus;

import java.util.Scanner;

public class Task_1247 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int N = scanner.nextInt();
        int[] sum = new int[S + 1];
        for (int i = 1; i <= S; i++)
            sum[i] = sum[i - 1] + scanner.nextInt();
        for (int i = 1; i <= S; i++)
            sum[i] -= i;
        int max = Integer.MIN_VALUE;
        boolean ok = true;
        for (int i = S; i > 0; i--) {
            max = Math.max(max, sum[i]);
            if (max > sum[i - 1] + N) {
                ok = false;
                break;
            }
        }
        System.out.println(ok ? "YES" : "NO");
    }
}
