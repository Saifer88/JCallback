package it.ilpirris.utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadUtils {

    public static String downloadPage(String request) {

        URL url;
        InputStream is = null;
        BufferedReader br;
        String line;
        String response = "";

        try {
            url = new URL(request);
            is = url.openStream();
            br = new BufferedReader(new InputStreamReader(is));

            while ((line = br.readLine()) != null) {
                response = response + "\n" + line;
            }

            return response;
        } catch (MalformedURLException mue) {
            mue.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (is != null) is.close();
            } catch (IOException ioe) {
            }
            return response;
        }
    }
}


