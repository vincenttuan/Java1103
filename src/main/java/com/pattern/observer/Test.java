package com.pattern.observer;

public class Test {
    public static void main(String[] args) {
        Subject news = new News();
        Observer user1 = new User("小明");
        Observer user2 = new User("小華");
        Observer user3 = new User("小英");
        // 訂閱
        news.add(user1);
        news.add(user2);
        news.add(user3);
        // 發送新聞
        news.notifyObserver("最近天氣很冷~~~");
        System.out.println();
        // 退訂
        news.remove(user2);        
        // 發送新聞
        news.notifyObserver("明天下雪~~~");
        System.out.println();
        
    }
}

