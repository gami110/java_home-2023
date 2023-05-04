package Lab4.Example1_14;

public class Example14 {
    public static void m(int x) throws ArithmeticException {
        int h = 10 / x;
    }

    public static void main(String[] args) {
        try {


            int l = args.length;
            System.out.println("размер массива равен " + l);
            m(l);
        } catch (ArithmeticException e) {
            System.out.println("ошибка деления на ноль");
        }
    }
}
