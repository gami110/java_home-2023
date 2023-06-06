package Lab8.Example2;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class ParserXml {
    private static final String TAG_SONG = "song";
    private static final String TAG_SONGNAME = "title";
    private static final String TAG_AUTHOR = "author";
    private static final String TAG_ALBUM = "album";

    public List<Song> parse(){
        Document doc;
        try {
            doc = buildDocument();
        } catch (Exception e){
            System.out.println(Arrays.toString(e.getStackTrace()));
            return null;
        }

        Node libraryNode = doc.getFirstChild();

        return parsSongTag(libraryNode);
    }



    private Document buildDocument() throws Exception{
        File file = new File("src/Lab8/Example2/exampleAddNewSong.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        return dbf.newDocumentBuilder().parse(file);
    }

    private List<Song> parsSongTag(Node libraryNode){
        List<Song> listSong = new ArrayList<>();
        NodeList songChilds = libraryNode.getChildNodes();

        for (int i = 0; i < songChilds.getLength(); i++){
            if (songChilds.item(i).getNodeType() != Node.ELEMENT_NODE){
                continue;
            }
            Song song = parseElement(songChilds.item(i));

            listSong.add(song);
        }
        return listSong;
    }

    private Song parseElement(Node elementNode){
        String title = "";
        String author = "";
        String album = "";

        NodeList elementChilds = elementNode.getChildNodes();

        for (int i = 0; i < elementChilds.getLength(); i++){
            if (elementChilds.item(i).getNodeType() != Node.ELEMENT_NODE){
                continue;
            }
            switch (elementChilds.item(i).getNodeName()) {
                case TAG_SONGNAME -> title = elementChilds.item(i).getTextContent();
                case TAG_AUTHOR -> author = elementChilds.item(i).getTextContent();
                case TAG_ALBUM -> album = elementChilds.item(i).getTextContent();
            }
        }
        return new Song(title, author, album);
    }

    public static void printSong(List<Song> songs, String parserType){
        System.out.println();
        System.out.println("Список песен в " + parserType + ":");
        for (Song oneSong : songs){
            System.out.println();
            System.out.println("Название песни: " + oneSong.getSongName());
            System.out.println("Исполнитель: " + oneSong.getAuthor());
            System.out.println("Альбом: " + oneSong.getAlbum());
        }
    }

    public void addNewSongXml() {


        Song newSong = newSong();
        Document doc = null;
        try {
            doc = buildDocument();
        } catch (Exception e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        // Создаем element Song, в который будем передавать ранее записанные параметры новой книги.
        assert doc != null;
        Element songElement = doc.createElement(TAG_SONG);

        // Создаем element для каждого свойства, которое необходимо заполнить для книг
        Element titleElement = doc.createElement(TAG_SONGNAME);
        Element authorElement = doc.createElement(TAG_AUTHOR);
        Element yearElement = doc.createElement(TAG_ALBUM);
        titleElement.appendChild(doc.createTextNode(newSong.getSongName()));
        authorElement.appendChild(doc.createTextNode(newSong.getAuthor()));
        yearElement.appendChild(doc.createTextNode(newSong.getAlbum()));
        songElement.appendChild(titleElement);
        songElement.appendChild(authorElement);
        songElement.appendChild(yearElement);

        // Добавляем ранее созданый и наполненный элемент song в "библиотеку" елементов
        // Получаем основной, "родительский" элемент и добавляем в него елемент Song
        Element libraryElement = doc.getDocumentElement();
        libraryElement.appendChild(songElement);

        DOMSource source = new DOMSource(doc);

        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            StreamResult result = new StreamResult("src/Lab8/Example2/exampleAddNewSong.xml");
            transformer.transform(source, result);
        } catch (Exception e){
            e.printStackTrace();
        }


        System.out.println("Новая песня добавлена");
    }

    public void deleteSong() {
        Scanner in = new Scanner(System.in);
        Document doc = null;
        try {
            doc = buildDocument();
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Введите название песни которую необходимо удалить: ");
        String titleDeleteSong = in.nextLine();

        assert doc != null;
        NodeList songNodes = doc.getElementsByTagName("song");
        for (int i = 0; i < songNodes.getLength(); i++){
            if (songNodes.item(i).getNodeType() != Node.ELEMENT_NODE){
                continue;
            }
            Element songElement = (Element) songNodes.item(i);
            Element titleElement = (Element) songElement.getElementsByTagName(TAG_SONGNAME).item(0);
            String title = titleElement.getTextContent();
            if (title.equals(titleDeleteSong)) {
                // Удаляем песню с данным элементoм
                songElement.getParentNode().removeChild(songElement);

                // Записываем изменения обратно в файл
                try {
                    TransformerFactory transformerFactory = TransformerFactory.newInstance();
                    Transformer transformer = transformerFactory.newTransformer();
                    DOMSource source = new DOMSource(doc);
                    StreamResult result = new StreamResult("src/Lab8/Example2/exampleAddNewSong.xml");
                    transformer.transform(source, result);

                    System.out.println("Песня удалена из XML");
                    return;
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Песня не найдена");
    }


    public static List<Song> findSong(List<Song> songs){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название или исполнителя песни");
        String inputString = in.nextLine();

        List<Song> foundSongs = new ArrayList<>();
        for (Song song : songs){
            if (song.getSongName().equalsIgnoreCase(inputString) | song.getAuthor().equalsIgnoreCase(inputString)){
                foundSongs.add(song);
            }
        }
        return foundSongs;
    }

    public static Song newSong() {
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("Введите название песни: ");
        String newTitle = in.nextLine();
        System.out.println("Введите исполнителя песни: ");
        String newAuthor = in.nextLine();
        System.out.println("Введите название альбома: ");
        String newAlbum = in.nextLine();


        return new Song(newTitle, newAuthor, newAlbum);
    }
}
