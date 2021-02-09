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
    public List<Rice> getRiceLict(String url) {
        try(InputStream is = new URL(url).openStream();
            InputStreamReader isr = new InputStreamReader(is, "UTF-8");
            BufferedReader br = new BufferedReader(isr)) {
            String data = "";
            String json = "";
            while( (data = br.readLine()) != null) {
                json += data;
            }
            System.out.println(json);
        } catch (Exception e) {
        }
        return null;
    }
}
