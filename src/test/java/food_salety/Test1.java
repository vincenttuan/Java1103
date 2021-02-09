package food_salety;

import food_salety.util.Service;
import org.junit.Test;

public class Test1 {
    @Test
    public void t1() {
        Service service = new Service();
        String url = "https://data.coa.gov.tw/Service/OpenData/FromM/AgricultureiRiceFailure.aspx";
        System.out.println(service.getJsonString(url));
        //String url2 = "https://data.coa.gov.tw/Service/OpenData/FromM/AgricultureiRiceQualified.aspx";
        //System.out.println(service.getJsonString(url2));
    }
}
