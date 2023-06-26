package Lektion25;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordCount {
    public static void main(String[] args) throws IOException {
        // URLs der Webseiten
        String[] urls = {
                "https://www.google.com/",
                "https://www.wikipedia.com/",
                "https://www.bing.com/"
        };

        // Herunterladen und Zusammenführen der Texte von den Webseiten
        Stream<String> textStream = Arrays.stream(urls)
                .map(WordCount::downloadWebPage)
                .flatMap(WordCount::extractText);

        // Word Count
        Map<String, Long> wordCount = textStream
                .map(line -> line.split("\\s+"))
                .flatMap(Arrays::stream)
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        // Ausgabe der Ergebnisse
        wordCount.forEach((word, count) -> System.out.println(word + ": " + count));
    }

    private static Stream<String> extractText(String html) {
        Document doc = Jsoup.parse(html);
        return Stream.of(doc.text().split("\\s+"));
    }

    private static String downloadWebPage(String url) {
        try {
            return Jsoup.connect(url).get().html();
        } catch (IOException e) {
            System.err.println("Fehler beim Herunterladen der Seite: " + url);
            return "";
        }
    }
}
