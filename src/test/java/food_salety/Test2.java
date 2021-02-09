package food_salety;

import food_salety.util.Service;
import org.junit.Test;

public class Test2 {
    @Test
    public void t2() {
        String url = "https://data.coa.gov.tw/Service/OpenData/FromM/AgricultureiRiceFailure.aspx";
        Service service = new Service();
        service.clearRiceTable();
        service.importToRiceTable(url);
        
    }
}
