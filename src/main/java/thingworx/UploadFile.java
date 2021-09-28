package thingworx;

import org.apache.commons.io.FileUtils;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.util.Base64;

public class UploadFile {
    public static void main(String[] args) throws IOException {
//        String url = "http://171.244.133.226:8080/Thingworx/Things/VTK.test/Services/UploadImage/image";
        String url = "http://171.244.133.226:8080/Thingworx/Things/FileRepository/Services/LoadImage/123/abc";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("Accept", "application/json");
        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("appKey", "f05c6759-2908-4cfe-9578-68faf0b14e50");
//        con.setDoInput(true);
        con.setDoOutput(true);

        // Read in the Image
//        File fi = new File("D:\\Code\\play_with_dsa\\src\\main\\java\\thingworx\\test.txt");
//        byte[] fileContent = Files.readAllBytes(fi.toPath());

//        byte[] fileContent = FileUtils.readFileToByteArray(fi);
//        String encodedString = Base64.getEncoder().encodeToString(fileContent);

        // Prepare a JSON body
//        JSONObject json = new JSONObject();
//        json.put("path", "/test");
//        json.put("content", encodedString);

        // Need to use a BufferedWriter instead of a DataOutputStream for JSON content
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(con.getOutputStream()));
//        out.write(json.toString());
//        out.flush();
//        out.close();

        // Read back the response from the ThingWorx server
        System.out.println("STATUS: " + con.getResponseCode());
        BufferedReader br = null;
        if (100 <= con.getResponseCode() && con.getResponseCode() <= 399) {
            br = new BufferedReader(new InputStreamReader(con.getInputStream()));
        } else {
            br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
        }
        System.out.println(br.readLine());
//        int responseCode = con.getResponseCode();
//        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
//        String inputLine;
//        StringBuilder response = new StringBuilder();
//
//        while ((inputLine = in.readLine()) != null) {
//            response.append(inputLine);
//        }
//        in.close();
//        System.out.println(response.toString());
    }
}
