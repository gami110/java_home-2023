package lab2;
import java.util.Arrays;
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("введите количество строк массива: ");
        int a =id.nextInt();
        int[][] ArrayZmeyka = new int[a][a];

        for (int ik = 0; ik < a; ik++) {
            for (int jk = 0; jk < a; jk++) {
                int i = ik + 1;
                int j = jk + 1;
                ArrayZmeyka[ik][jk] = ((i - 1) * a + j) * (i % 2) + (i * a + 1 - j) * ((i + 1) % 2);
            }
        }
        for (int[] ints : ArrayZmeyka) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
