package API;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class ApiReader {

    /*
    VIGTIG REFACTOR - METODEN LUKKER SIG IKKE (den kører udendeligt) -
    THOMAS VIDSTE IKKE HVORDAN I SIDSTE UGE.
    SÅ VI SKAL HAVE FAT I HAM OMKRING DET
    */

    public static void apiGet(String location) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String url = "https://vejr.eu/api.php?location="+location+"&degree=C";
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        Request request = new Request.Builder()
                .url(url)
                .method("GET", null)
                .build();
        Response response = null;
        try {
            response = client.newCall(request).execute();
            String res = response.body().string();

            

            System.out.println(res);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }



}