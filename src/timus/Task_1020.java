package timus;

import java.util.Scanner;

public class Task_1020 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double x, y, r, x1, y1, xPr, yPr, a, b, Summ = 0;
        r = input.nextDouble();
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        xPr = x1;
        yPr = y1;
        for (int i = 0; i < n - 1; i++) {
            x = input.nextDouble();
            y = input.nextDouble();
            a = x - xPr;
            b = y - yPr;
            xPr = x;
            yPr = y;
            Summ += Math.sqrt(a*a + b*b);
            if (i == n - 2) {
                a = x - x1;
                b = y - y1;
                Summ += Math.sqrt(a*a + b*b);
            }
        }
        Summ += 2 * Math.PI*r;
        System.out.printf("%.2f", Summ);
    }
}
