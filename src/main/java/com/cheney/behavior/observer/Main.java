package com.cheney.behavior.observer;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-08 20:12
 * @注释
 */
public class Main {
    public static void main(String[] args) {
        // 微信公众号
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();

        // 实例化用户
        WeChatUser user1 = new WeChatUser("Toy");
        WeChatUser user2 = new WeChatUser("Jay");
        WeChatUser user3 = new WeChatUser("Jack");

        // 订阅公众号
        subscriptionSubject.attach(user1);
        subscriptionSubject.attach(user2);
        subscriptionSubject.attach(user3);

        // 推送消息
        subscriptionSubject.notify("抽取iPhone15，就在今天！");
    }
}
