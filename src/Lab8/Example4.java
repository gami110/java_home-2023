package Lab8;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

record TitleNews(String title, String publicDate) {

}

public class Example4 {
    private static final String filePath = "src/Lab8/htmlParser.txt";

    public static void main(String[] args) {

        String title;
        String publicDate;
        String url = "http://fat.urfu.ru/index.html";
        int maxTries = 3;
        int tryCount = 0;
        List<TitleNews> listNewsTitle = new ArrayList<>();
        Document doc = null;

        try {
            while (tryCount < maxTries) {
                try {
                    doc = Jsoup.connect(url).get();
                    break;
                } catch (IOException e) {
                    tryCount++;
                    if (tryCount == maxTries) {
                        System.out.println("Ошибка при подключение к URL: " + url);
                        System.exit(0);
                    } else {
                        Thread.sleep(5000);
                        System.out.println("Повторное покдлючение... №" + tryCount);
                    }
                }
            }


            assert doc != null;
            Elements newsParent = doc.select(
                    "body > table > tbody > tr > td > div > table > " +
                            "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " +
                            "tr > td:nth-child(1)");


            for (int i = 3; i < 20; i++) {
                if (!(i % 2 == 0)) {
                    List<Node> nodes = newsParent.get(0).childNodes();
                    title = ((Element) nodes.get(i)).getElementsByClass("blocktitle")
                            .get(0).childNodes().get(0).toString();
                    publicDate = ((Element) nodes.get(i)).getElementsByClass("blockdate")
                            .get(0).childNodes().get(0).toString();
                    TitleNews tItleNews = new TitleNews(title, publicDate);
                    listNewsTitle.add(tItleNews);
                }
            }
            writeData(listNewsTitle);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void writeData(List<TitleNews> titleNewsList) throws IOException {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream(filePath), StandardCharsets.UTF_8));
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (TitleNews news : titleNewsList) {
            try {
                assert bw != null;
                bw.write("Заголовок: " + news.title() + ", Дата публикации: " + news.publicDate());
                bw.newLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        assert bw != null;
        bw.flush();
        bw.close();
    }
}
