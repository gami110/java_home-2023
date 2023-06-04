package timus;

import java.util.Scanner;
import java.util.ArrayList;

public class Task_1142 {
    public static int fact(int a) {
        if (a == 0)
            return 0;
        int res = 1;
        for (int i = 1; i <= a; i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> StN = new ArrayList<>(11);
        for (int i = 0; i < 11; i++) {
            StN.add(new ArrayList<>(11));
            for (int j = 0; j < 11; j++) {
                StN.get(i).add(0);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        int ans, vv;
        StN.get(0).set(0, 1);
        for (int n = 1; n <= 10; ) {
            for (int k = 0; k <= 10; k++) {
                if (k == n) {
                    StN.get(n).set(k, 1);
                    n++;
                    break;
                } else if (k == 0)
                    StN.get(n).set(k, 0);
                else if (k == 1) {
                    StN.get(n).set(k, 1);
                } else
                    StN.get(n).set(k, k * StN.get(n - 1).get(k) + StN.get(n - 1).get(k - 1));
            }
        }
        for (int n = 2; n <= 10; n++) {
            ans = 0;
            for (int k = 1; k <= n; k++) {
                ans += fact(k) * StN.get(n).get(k);
            }
            list.add(ans);
        }
        while (input.hasNext()) {
            vv = input.nextInt();
            if (vv == -1) {
                break;
            }
            System.out.println(list.get(vv - 2));
        }
    }
}
