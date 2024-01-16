package com.cheney.behavior.observer.jdkImpl;

import java.util.Observable;
import java.util.Observer;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-12 14:59
 * @注释
 */

// 微信公众号是发布者（被观察者）
public class SubscriptionSubject extends Observable {
    String subName; // 公众号名字
    public SubscriptionSubject(String name){
        this.subName = name;
    }

    public String getSubName() {
        return subName;
    }

    @Override
    public synchronized void addObserver(Observer o) {
        System.out.println("微信公众号订阅数+1");
        super.addObserver(o);
    }

    @Override
    public synchronized void deleteObserver(Observer o) {
        System.out.println("微信公众号订阅数-1");
        super.deleteObserver(o);
    }

    @Override
    public void notifyObservers(Object arg) {
        System.out.println("微信公众号发布文章");
        super.notifyObservers(arg);
    }

    public void publishContent(String msg){
        System.out.println("发布内容为："+msg);
        super.setChanged(); // changed = true
        notifyObservers(msg);  // 通知所有订阅者（观察者）
    }
}
