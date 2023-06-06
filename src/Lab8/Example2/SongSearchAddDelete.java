package Lab8.Example2;
import java.util.Scanner;
public class SongSearchAddDelete {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ParserXml parserXml = new ParserXml();
        System.out.println();
        System.out.println("Основное меню (Парсинг XML): ");
        System.out.println("Нажмите '1' что бы вывести список песен");
        System.out.println("Нажмите '2' что бы добавить новую песню");
        System.out.println("Нажмите '3' что бы найти песню по названию или альбому");
        System.out.println("Нажмите '4' что бы удалить песню по названию");
        System.out.println("Нажмите '5' что бы закрыть программу");
        System.out.print("Выбранно: ");

        int choiceOption = in.nextInt();
        in.nextLine();

        switch (choiceOption) {
            case 1 -> ParserXml.printSong(parserXml.parse(), "XML");
            case 2 -> parserXml.addNewSongXml();
            case 3 -> ParserXml.printSong(ParserXml.findSong(parserXml.parse()), "XML с указанным исполнителем");
            case 4 -> parserXml.deleteSong();
            case 5 -> System.exit(0);
        }
    }
}
