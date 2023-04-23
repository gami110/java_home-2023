package Lab3;

import java.util.Scanner;

public class Example2 {

    public static int DecToBin(int n) {
        if (n == 1) {
            return 1;
        }
        return DecToBin(n / 2) * 10 + n % 2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int n = in.nextInt();
        System.out.println("Ваше число в двоичной системе: " + DecToBin(n));
    }
}
