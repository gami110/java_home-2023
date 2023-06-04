package timus;

import java.util.Scanner;

public class Task_1083 {
    public static long fact(int n, int k) {
        long ans = 1;
        int i = 0;
        for (; n - i * k > 0; i++) {
            ans *= n - (long) i * k;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int k = s.length();
        System.out.println(fact(n, k));
    }
}

