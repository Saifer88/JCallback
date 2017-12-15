package it.ilpirris.provider;

import it.ilpirris.action.Desire;
import it.ilpirris.utility.DownloadUtils;

public class ConnectionProvider {



    public static void get(String url, Desire desire)
    {
        desire.fulfill(DownloadUtils.downloadPage(url));

    }

    public static void asynchronousGet(String url, Desire desire)
    {
        new Thread(() -> {
            desire.fulfill(DownloadUtils.downloadPage(url));
        }).start();
    }
}
