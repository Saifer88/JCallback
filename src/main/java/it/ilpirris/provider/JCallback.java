package it.ilpirris.provider;

import it.ilpirris.action.DesirePage;
import it.ilpirris.action.DesireFile;
import it.ilpirris.utility.DownloadUtils;

public class JCallback {


    public static void get(String url, DesirePage desire)
    {
        desire.fulfill(DownloadUtils.downloadPage(url));
    }

    public static void asyncGet(String url, DesirePage desire)
    {
        new Thread(() -> desire.fulfill(DownloadUtils.downloadPage(url)))
                .start();
    }

    public static void download(String url, DesireFile desire)
    {
        desire.fulfill(DownloadUtils.downloadFile(url));
    }

    public static void asyncDownload(String url, DesireFile desire)
    {
        new Thread(() -> desire.fulfill(DownloadUtils.downloadFile(url)))
                .start();
    }
}
