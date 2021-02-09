package food_salety;

import food_salety.entity.Rice;
import food_salety.util.Service;
import org.junit.Test;

public class Test3 {
    @Test
    public void t2() {
        Service service = new Service();
        for(Rice r : service.queryRicesFromTable("冠軍")) {
            System.out.println(r.get品名() + " : " +  r.get檢驗結果() + " : " + r.get不合格原因());
        }
        
    }
}
