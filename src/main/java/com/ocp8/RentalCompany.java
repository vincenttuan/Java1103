package com.ocp8;

// 租賃工司

import java.util.Arrays;

public class RentalCompany {
    // 交通工具的庫存陣列
    private Transportation[] transportations;
    
    public RentalCompany() {
        // 庫存配置
        transportations = new Transportation[]{
            new Car("賓利", 10, 100, 2000), // 買車
            new Bicycle("Ubike", 20, 10, 10), // 買腳踏車
            new Airplane("灣流", 5, 800, 50000),// 買飛機
        };
    }
    
    // 取得交通工具庫存
    public Transportation[] getTransportations() {
        return transportations;
    }
    
    
    // 主程式
    public static void main(String[] args) {
        // 開公司
        RentalCompany rc = new RentalCompany();
        // 查看庫存
        Transportation[] trans = rc.getTransportations();
        System.out.println(Arrays.toString(trans));
    }
}
