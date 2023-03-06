package lab1;
import java.util.Scanner;
public class example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите целое число:");
        int a = in.nextInt();

        System.out.printf("Последовательность из четырех чисел:" +
                " %nЧисло на еденицу меньше: %d;" +
                " %nВаше число: %d;" +
                " %nЧисло на еденицу больше: %d;" +
                " %nКвадрат числа: %d.",a-1, a, a+1, a*a);
    }
}
