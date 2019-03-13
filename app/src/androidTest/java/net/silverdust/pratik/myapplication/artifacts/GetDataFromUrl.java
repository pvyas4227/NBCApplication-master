package net.silverdust.pratik.myapplication.artifacts;

import android.net.Uri;
import android.os.AsyncTask;

import net.silverdust.pratik.myapplication.MainActivity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpRetryException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.Set;


/**
 * Created by pratik on 3/12/19.
 */

public class GetDataFromUrl {
    String data;

    public String getDataFromUrl(String url, String queryParameter) {
        Uri uri = Uri.parse(url);
        String server = uri.getAuthority();
        String path = uri.getPath();
        String protocol = uri.getScheme();
        Set<String> args = uri.getQueryParameterNames();

        data = uri.getQueryParameter(queryParameter);

        return data;
    }
}