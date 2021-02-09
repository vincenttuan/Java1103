package food_salety.util;

import food_salety.entity.Rice;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;

public class Service {
    // 取得 json 資料
    public String getJsonString(String url) {
        String json = null;
        try(InputStream is = new URL(url).openStream();
            InputStreamReader isr = new InputStreamReader(is, "UTF-8");
            BufferedReader br = new BufferedReader(isr)) {
            String data = "";
            while( (data = br.readLine()) != null) {
                json += data;
            }
        } catch (Exception e) {
        }
        return json;
    }
}
