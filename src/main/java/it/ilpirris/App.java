package it.ilpirris;

import it.ilpirris.provider.ConnectionProvider;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("My code is starting");

        ConnectionProvider.asynchronousGet(
                "https://www.google.it", html -> System.out.println("The page you looked for is long: " + html.length())
        );


        System.out.println("My code is continuing");
    }
}
