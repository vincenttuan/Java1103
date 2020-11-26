package com.ocp8;

// 租賃工司
public class RentalCompany {

    // 交通工具的庫存陣列
    private Transportation[] transportations;
    // 租金
    private int rent;

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
    
    // 取得租金
    public int getRent() {
        return rent;
    }

    // 租車
    public boolean rentCar(int amount) {
        // 查 Car 的數量 ?
        int carAmount = 0;
        for (Transportation ts : transportations) {
            if (ts instanceof Car) {
                carAmount += ts.getAmount();
            }
        }
        // 是否夠租 ?
        if (carAmount >= amount) {
            // 租金區域變數
            int rent = 0;
            for (Transportation ts : transportations) {
                if (ts instanceof Car) {
                    // 減去庫存
                    ts.setAmount(ts.getAmount() - amount);
                    // 累計租金
                    rent += ts.getPrice() * amount;
                }
            }
            // 將租金區域變數的值設定給 rent 物件變數
            this.rent = rent;
            return true;
        } else {
            return false;
        }
    }

}
