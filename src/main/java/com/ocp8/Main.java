package com.ocp8;

import java.util.Arrays;

public class Main {
    // 主程式
    public static void main(String[] args) {
        // 開公司
        RentalCompany rc = new RentalCompany();
        // 查看庫存
        Transportation[] trans = rc.getTransportations();
        System.out.println(Arrays.toString(trans));
    }
}
