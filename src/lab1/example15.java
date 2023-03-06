package lab1;
import java.util.Scanner;
public class example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число a:");
        int a = in.nextInt();
        System.out.println("Введите число b:");
        int b = in.nextInt();

        System.out.printf("Сумма чисел a и b: %d;" +
                "%nРазность чисел a и b: %d.", a+b, a-b);

    }
}
