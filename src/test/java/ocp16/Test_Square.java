package ocp16;

import com.ocp16_exception.Square;
import org.junit.Assert;
import org.junit.Test;

public class Test_Square {
    @Test
    public void test() {
        // 測試 3A
        // Arrange - 安排(目標物件)
        // Act - 目標方法
        // Assert - 驗證是否符合預期 ?
        
        // Arrange - 安排(目標物件)
        Square sq = new Square();
        // 參數:
        int w = 10;
        int h = 5;
        // 期望結果
        int exp = 50; // exp 表示期望值
        // Act - 目標方法
        int act = sq.getArea(w, h); // act 表示實際值
        // Assert - 驗證是否符合預期 ?
        Assert.assertEquals(exp, act); // exp 期望值 == act 實際值
        
    }
}
