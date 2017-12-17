package it.ilpirris;

        import it.ilpirris.provider.JCallback;

        import java.io.File;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println("My code is starting");

        JCallback.asyncGet(
                "https://www.google.it", System.out::println);


        JCallback.asyncDownload(
                "http://ipv4.download.thinkbroadband.com/5MB.zip",
                file -> System.out.println(file.getName()));

        System.out.println("My code is continuing");
    }
}
