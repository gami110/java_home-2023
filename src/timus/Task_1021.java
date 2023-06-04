package timus;

import java.util.Scanner;
import java.util.HashSet;

public class Task_1021 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int vv;
        HashSet<Integer> v1 = new HashSet<>();
        for (int i = 0; i < n1; i++) {
            vv = input.nextInt();
            v1.add(vv);
        }
        int n2 = input.nextInt();
        for (int i = 0; i < n2; i++) {
            vv = input.nextInt();
            if (v1.contains(10000 - vv)) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}


