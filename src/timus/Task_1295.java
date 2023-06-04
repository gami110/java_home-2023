package timus;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Task_1295 {
    public static void main(String[] args) throws IOException {
        int[][] st = new int[3][];
        st[0] = new int[20];
        st[1] = new int[20];
        st[2] = new int[10];
        st[0][0] = 2;
        st[1][0] = 3;
        st[2][0] = 4;
        for (int i = 0; i <= 2; i++) {
            int osn = i + 2;
            HashSet<Integer> set = new HashSet<>();
            set.add(st[i][0]);
            for (int j = 1; j < st[i].length; j++) {
                int newst = (osn * st[i][j - 1]) % 100;
                while (set.contains(newst)) {
                    newst += osn;
                    newst %= 100;
                }
                set.add(newst);
                st[i][j] = newst;
            }
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        n--;
        int sum = 1 + st[0][n < 20 ? n : n % 20] + st[1][n % 20] + st[2][n % 10];
        if (sum % 100 == 0)
            System.out.println(2);
        else if (sum % 10 == 0)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
