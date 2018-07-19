package pl.mariuszlyszczarz.weather.models;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class Utils {
    public static String redWebsiteContent(String url){
        StringBuilder stringBuilder = new StringBuilder();
        try {
            HttpURLConnection urlConnection = (HttpURLConnection) new URL(url).openConnection();
            InputStream content = urlConnection.getInputStream();

            int read = 0;
            while((read = content.read()) != -1){
                stringBuilder.append((char)read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
}
