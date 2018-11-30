package httpurlconnectdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author Wayne Thomas sandbox code provided by
 * https://www.youtube.com/watch?v=hWUAejAlLEE&t=231s
 */
public class HTTPURLConnectDemo {

    private static Scanner in;

    public static void main(String[] args) throws IOException {
        in = new Scanner(System.in);
        String username = null;
        String password = null;
        System.out.println("Please enter your username:");
        username = in.next();

        System.out.println("Please enter your password:");
        password = in.next();

        String urlLink = "http://localhost/java/java.php?username=" + username + "&password=" + password;
        URL url = new URL(urlLink);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuffer sb = new StringBuffer();
        String line;

        while ((line = in.readLine()) != null) {
            sb.append(line);

        }
        in.close();
        System.out.println(sb.toString());
    }

}
