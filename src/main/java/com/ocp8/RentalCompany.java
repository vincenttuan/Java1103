package com.ocp8;

// 租賃工司
public class RentalCompany {
    // 交通工具的庫存陣列
    private Transportation[] transportations;
    
    public RentalCompany() {
        // 庫存配置
        transportations = new Transportation[]{
            new Car(), // 買車
            new Bicycle(), // 買腳踏車
            new Airplane(),// 買飛機
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
        System.out.println(trans);
    }
}
