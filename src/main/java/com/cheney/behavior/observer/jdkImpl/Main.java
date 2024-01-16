package com.cheney.behavior.observer.jdkImpl;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-12 15:15
 * @注释
 */
public class Main {
    public static void main(String[] args) {
        // 创建公众号（被观察者）
        SubscriptionSubject sub = new SubscriptionSubject("矩阵科学");
        // 创建微信用户（观察者）
        WeChatUser user1 = new WeChatUser("Jay");
        WeChatUser user2 = new WeChatUser("Tom");
        WeChatUser user3 = new WeChatUser("Jack");

        sub.addObserver(user1);
        sub.addObserver(user2);
        sub.addObserver(user3);

        sub.publishContent("欢迎大家关注我的公众号！明天晚上给大家抽iPhone15,谢谢！");

        sub.deleteObserver(user1);
    }
}
