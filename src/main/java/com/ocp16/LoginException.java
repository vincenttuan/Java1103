package com.ocp16;

public class LoginException extends Exception {

    public LoginException(String string) {
        // 將錯誤訊息傳給父類別
        super(string);
    }
    
    // 自訂一個新方法
    public void 怎麼辦() {
        System.out.println("請重新登入");
    }
    
}
