package timus;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Task_1025 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, n05, Ans = 0;
        n = input.nextInt();
        ArrayList<Integer> groups = new ArrayList<>(Collections.nCopies(n, 0));
        n05 = n / 2 + 1;
        for (int i = 0; i < n; i++) {
            groups.set(i, input.nextInt());
        }
        for (int i = 0; i < n05; i++) {
            Ans += (Collections.min(groups) / 2) + 1;
            groups.remove(Collections.min(groups));
        }
        System.out.println(Ans);
    }
}

