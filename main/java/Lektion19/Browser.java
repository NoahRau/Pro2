package Lektion19;

import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Browser<T> {

    public Optional<URL> back() {
        try {
            URL url = Math.random() < 0.5 ? new URL("http://google.de") : null;
            return Optional.ofNullable(url);
        } catch(MalformedURLException e) {
            return Optional.empty();
        }
    }
    public String retrieveSite(Optional<URL> url)
    {
        //simulate download site:
        return url.toString();
    }

    @Test
    public void testBack() {
        Browser browser = new Browser();
        Optional back = browser.back();
        if (back.isPresent()) {
            String site = browser.retrieveSite(Optional.of(back.get()));
            assertNotNull(site);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Normal back");
        Browser<URL> browser = new Browser<>();
        Optional<URL> back = browser.back();
        browser.retrieveSite(back);

        System.out.println(back);
    }
}
