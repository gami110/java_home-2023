package timus;

import java.util.Scanner;

public class Task_1192 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int v = input.nextInt();
        int a = input.nextInt();
        double k = input.nextDouble();
        System.out.printf("%.2f", ((v * v * k * Math.sin(a * 3.1415926535 / 90)) / (10 * (k - 1))));
    }
}
