package com.cheney.behavior.observer.jdkImpl;

import java.util.Observable;
import java.util.Observer;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-12 15:00
 * @注释
 */

// 微信用户是观察者（订阅者）
public class WeChatUser implements Observer {
    private String name;
    public WeChatUser(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public void update(Observable o, Object arg) {
        String subName = ((SubscriptionSubject) o).getSubName();
        System.out.println("我是用户"+name+"，收到了公众号消息:"+subName+"发来的消息"+(String) arg);
    }
}
