/*
 * https://www.loggly.com/docs/http-endpoint/
 */

import com.google.gson.Gson;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GggTestUtilities {

    public static void println(Object logItem) {
        try {

            String apiKey = ReadFileContent("C:/apiKeys/loggly/apiKey.txt");
            String url = "http://logs-01.loggly.com/inputs/" + apiKey;
            LogObject logObject = new LogObject(logItem);
            HttpPostRequest2(url, logObject.toJson());
        } catch (Exception ex) {
            System.err.println(ex);
        }
        System.out.println(logItem);
    }

    private static String ReadFileContent(String filePath) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(filePath));
        try {
            long len = new File(filePath).length();
            byte[] bytes = new byte[(int) len];
            dataInputStream.readFully(bytes);
            return new String(bytes, "UTF-8");
        } finally {
            dataInputStream.close();
        }
    }

    static class LogObject {
        private final String Message;
        private final String LogDate;
        private final long ThreadId;

        public LogObject(Object logMessage) {
            Gson gson = new Gson();
            Message = gson.toJson(logMessage);
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy hh:mm:ss zzz");
            String format = sdf.format(date);
            LogDate = format;
            ThreadId = Thread.currentThread().getId();
        }

        public String toJson() {
            Gson gson = new Gson();
            String json = gson.toJson(this);
            return json;
        }
    }

    // https://www.mkyong.com/java/how-to-send-http-request-getpost-in-java/
    private static void HttpPostRequest2(String url, String body) throws IOException {
        final String USER_AGENT = "Mozilla/5.0";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        //add reuqest header
        con.setRequestMethod("POST");
        con.setRequestProperty("User-Agent", USER_AGENT);
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
        // Send post request
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(body);
        wr.flush();
        wr.close();

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + body);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        System.out.println(response.toString());

    }


}
