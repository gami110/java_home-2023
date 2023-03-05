package lab1;
import java.util.Scanner;
public class example6 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       System.out.println("Ваше имя:");
       String name = in.nextLine();

       System.out.println("Ваша фамилия:");
       String last_name = in.nextLine();

       System.out.println("Ваше отччество:");
       String fast_name = in.nextLine();

       System.out.println("Hello "+last_name+" "+name+ " "+fast_name);
    }
}
