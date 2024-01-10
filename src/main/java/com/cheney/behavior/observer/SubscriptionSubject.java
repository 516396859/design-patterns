package com.cheney.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-08 20:10
 * @注释
 */
public class SubscriptionSubject implements Subject{
    //储存订阅公众号的微信用户
    private List<Observer> weChatUserList = new ArrayList<Observer>();
    @Override
    public void attach(Observer observer) {
        weChatUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weChatUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer o : weChatUserList){
            o.update(message);
        }
    }
}
