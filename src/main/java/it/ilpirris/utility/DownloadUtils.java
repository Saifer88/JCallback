package it.ilpirris.utility;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

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

    public static File downloadFile(String url)
    {
        try
        {
            URL website = new URL(url);
            URLConnection c = website.openConnection();
            c.setRequestProperty("User-Agent", "Mozilla/5.0");
            File file = new File(url.substring(url.lastIndexOf("/") + 1));
            ReadableByteChannel rbc = Channels.newChannel(c.getInputStream());
            FileOutputStream fos = new FileOutputStream(url.substring(url.lastIndexOf("/") + 1));
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
            return file;
        }catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

}


