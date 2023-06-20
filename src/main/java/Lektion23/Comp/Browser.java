package Lektion23.Comp;

import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.fail;

public class Browser<T> {

    public Optional<URL> back() {
        try {
            URL url = Math.random() < 0.5 ? new URL("http://google.de") : null;
            return Optional.ofNullable(url);
        } catch(MalformedURLException e) {
            return Optional.empty();
        }
    }
    public String retrieveSite(URL url)
    {
        //simulate download site:
        return url.toString();
    }

    @Test
    public void testBack() {
        Lektion23.Comp.Browser browser = new  Lektion23.Comp.Browser();
        Optional<URL> back = browser.back();
        try {
            back.ifPresent(browser::retrieveSite);
        }catch (NullPointerException e){fail("NPE");}
        }


    public static void main(String[] args)
    {
        System.out.println("Normal back");
        Lektion19.Browser<URL> browser = new Lektion19.Browser<>();
        Optional<URL> back = browser.back();
        browser.retrieveSite(back);

        System.out.println(back);
    }
}
