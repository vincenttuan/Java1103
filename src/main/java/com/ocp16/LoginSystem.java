package com.ocp16;

import java.util.Arrays;
import java.util.List;

public class LoginSystem {
    // 可以登入的使用者
    private static List<String> users = Arrays.asList("john", "mary", "admin");
    
    public static boolean login(String userName) {
        boolean check = users.stream().filter(name -> name.equals(userName)).findFirst().isPresent();
        return check;
    }
    
    public static void main(String[] args) {
        System.out.println(login("apple"));
        System.out.println(login("admin"));
    }
}
