package timus;

import java.util.Scanner;

public class Task_1354 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vv;
        int m, l, r, rzm;
        vv = sc.next();
        rzm = vv.length();
        if (rzm == 1) {
            System.out.println(vv + vv);
            return;
        }
        for (m = rzm / 2; m < rzm; m++) {
            if (!(m == rzm / 2 && rzm % 2 == 0)) {
                for (l = m - 1, r = m; r < rzm && vv.charAt(l) == vv.charAt(r); r++, l--) {
                    if (r == rzm - 1 && rzm != 2 * m) {
                        for (int i = 0; i < m; i++)
                            System.out.print(vv.charAt(i));
                        for (int i = m - 1; i >= 0; i--)
                            System.out.print(vv.charAt(i));
                        return;
                    }
                }
            }
            for (l = m - 1, r = m + 1; r < rzm && vv.charAt(l) == vv.charAt(r); r++, l--) {
                if (r == rzm - 1 && rzm != 2 * m + 1) {
                    for (int i = 0; i <= m; i++)
                        System.out.print(vv.charAt(i));
                    for (int i = m - 1; i >= 0; i--)
                        System.out.print(vv.charAt(i));
                    return;
                }
            }
        }
        System.out.print(vv);
        for (int i = rzm - 2; i >= 0; i--) {
            System.out.print(vv.charAt(i));
        }
    }
}
