package com.cheney.creator.singletonDemo;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-05 14:57
 * @注释 静态代码块方式创建单例，线程安全，但是饿汉式创建
 */
public class Singleton2 {
    private Singleton2(){
        // 构造方法私有，即不可从外部直接创建单例对象
        // 只能通过类提供的方法获取单例对象
    }

    private static final Singleton2 instance;
    static {
        instance = new Singleton2();
    }

    public static Singleton2 getInstance(){
        return instance;
    }

    // 单例其他的功能实现
    public long add(int a,int b){
        return a+b;
    }

}
