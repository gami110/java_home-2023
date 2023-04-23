package Lab3;

public class Example1 {

    //  пример 1
    public static void m(int x) {
        System.out.println("x=" + x);
        if ((2 * x + 1) < 20) {
            m(2 * x + 1);
        }
    }

    //  пример 2
    public static void n(int y) {
        if ((2 * y + 1) < 20) {
            n(2 * y + 1);
        }
        System.out.println("y=" + y);
    }

    //  Пример 3
    private static int step = 0;

    public static void p(int z) {
        space();
        System.out.println(" " + z + "->");
        step++;
        if ((2 * z + 1) < 20) {
            p(2 * z + 1);
        }
        step--;
        space();
        System.out.println(" " + z + "<-");
    }

    public static void space() {
        for (int i = 0; i < step; i++) {
            System.out.print(" ");
        }
    }

    //  Пример 4
    public static int fact(int n) {
        int result;
        if (n == 1) return 1;
        else {
            result = fact(n - 1) * n;
            return result;
        }
    }

    //    пример 5
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Пример №1");
        m(1);
        System.out.println("Пример №2");
        n(1);
        System.out.println("Пример №3");
        p(1);
        System.out.println("Пример №4");
        System.out.println(fact(5));
        System.out.println("Пример №5");
        System.out.println(fibonacci(7));

    }
}
