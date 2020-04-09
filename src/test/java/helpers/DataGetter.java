package helpers;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import okhttp3.*;

import java.io.IOException;

public class DataGetter {

    private String poseidonUrl = "https://poseidon.worklifebeyond.com";
    private String access_token = null;

    public static void main(String[] args) throws IOException {
        DataGetter data = new DataGetter();
        data.login();
    }
    public void login() throws IOException {
        if(access_token != null){
            System.out.println("Already Logged in");
            return;
        }
        OkHttpClient client = new OkHttpClient().newBuilder()
          .build();
        MediaType mediaType = MediaType.parse("application/json,text/plain");
        RequestBody body = RequestBody.create(mediaType, "{\n\t\"email\": \"arief@wlb.co.id\",\n\t\"password\": \"Sukses2121\"\n}");
        Request request = new Request.Builder()
          .url(poseidonUrl+"/global/accounts/login")
          .method("POST", body)
          .addHeader("Content-Type", "application/json")
          .addHeader("Content-Type", "text/plain")
          .build();
        Response response = client.newCall(request).execute();
        String json = response.body().string();
        JsonParser parser = new JsonParser();
        JsonObject jsonObject = (JsonObject) parser.parse(json);
        access_token = jsonObject.getAsJsonObject("oauth").get("access_token").getAsString();
        System.out.println(access_token);
    }
}
