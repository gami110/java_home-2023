package Lab5;

public class Example4 {
    public static void main(String[] args) throws InterruptedException {
        // С помощью цикла создаем нужное колличество потоков
        for (int i = 0; i < 10; i++) {
            Thread t1 = new Thread(() -> System.out.println(Thread.currentThread().getName()));
            t1.start();
        }
    }
}
