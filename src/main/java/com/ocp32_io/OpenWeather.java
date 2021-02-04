package com.ocp32_io;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONObject;

public class OpenWeather {
    public static void main(String[] args) throws Exception {
        String id = "fcc57465b76d35357c84e4e30fe2431a";
        String cityName = "taoyuan,TW";
        String urlstr = "http://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s";
        urlstr = String.format(urlstr, cityName, id);
        System.out.println(urlstr);
        URL url = new URL(urlstr);
        InputStream is = url.openStream();
        Reader r = new InputStreamReader(is);
        int data = 0;
        String jsonStr = "";
        while ( (data = r.read()) != -1) {            
            jsonStr += (char)data;
        }
        System.out.println(jsonStr);
        // 分析 Json 字串
        JSONObject root = new JSONObject(jsonStr);
        JSONObject main = root.getJSONObject("main");
        double temp = main.getDouble("temp") - 273.15;
        double feels_like = main.getDouble("feels_like") - 273.15;
        int humidity = main.getInt("humidity");
        int dt = root.getInt("dt");
        //---------------------------------------------------------------------------------------
        Calendar calendar = Calendar.getInstance();
        TimeZone tz = TimeZone.getDefault();
        calendar.add(Calendar.MILLISECOND, tz.getOffset(calendar.getTimeInMillis()));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        java.util.Date currenTimeZone=new java.util.Date((long)1612443792*1000);
        //---------------------------------------------------------------------------------------
        System.out.printf("目前溫度: %.2f\n", temp);
        System.out.printf("體感溫度: %.2f\n", feels_like);
        System.out.printf("目前濕度: %d %%\n", humidity);
        System.out.printf("發佈時間: %s\n", sdf.format(currenTimeZone));
        
    }
}
