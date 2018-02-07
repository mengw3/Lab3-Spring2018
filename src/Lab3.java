import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Lab3 {
    public static int number(String website) {
        website.replace("^[A-Za-z]",",");
        String[] a = website.split(",");
        int n = a.length;
        return n;
    }
    public static int numberAppear(String website, String word) {
        website.replace("^[A-Za-z]",",");
        String[] a = website.split(",");
        int n = a.length;
        for(int i = 0; i < n; i++) {
            
        }

    }
    public static void main(String[] unused) {
        String website = urlToString("http://erdani.com/tdpl/hamlet.txt");
        System.out.println(website);
        number(website);
    }

    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */

    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }
}
