package timus;

import java.util.*;

public class Task_1104 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A')
                sum += s.charAt(i) - 'A' + 10;
            else
                sum += s.charAt(i) - '0';
        }
        char max = '0';
        int Osn;
        for (int i = 0; i < s.length(); i++) {
            if (max < s.charAt(i)) {
                max = s.charAt(i);
            }
        }
        if (max >= 'A')
            Osn = max - 'A' + 10 + 1;
        else
            Osn = max - '0' + 1;
        if (Osn < 2)
            Osn = 2;
        for (long k = Osn; k <= 36; k++) {
            if (sum % (k - 1) == 0) {
                System.out.print(k);
                return;
            }
        }
        System.out.print("No solution.");
    }
}

