package timus;

import java.util.Scanner;
import java.util.Vector;

public class Task_1044 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), sum, copy, subleng;
        long ans = 0;
        int leng = n / 2, maxs = leng * 9;
        String s = new String(new char[leng]).replace("\0", "9");
        int maxn = Integer.parseInt(s);
        Vector<Integer> v = new Vector<>(maxs + 1);
        for (int i = 0; i <= maxs; i++) {
            v.add(0);
        }
        for (int chislo = 0; chislo <= maxn; chislo++) {
            sum = 0;
            copy = chislo;
            for (int step = 1; step <= leng; step++) {
                sum += copy % 10;
                copy /= 10;
            }
            v.set(sum, v.get(sum) + 1);
        }
        for (int i = 0; i < maxs + 1; i++) {
            ans += v.get(i) * v.get(i);
        }
        System.out.println(ans);
    }
}

