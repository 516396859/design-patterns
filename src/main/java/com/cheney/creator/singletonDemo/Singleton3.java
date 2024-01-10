package com.cheney.creator.singletonDemo;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-05 15:02
 * @注释 静态内部类方式（线程安全）,懒汉模式创建
 */

public class Singleton3 {
    //私有构造方法
    private Singleton3() {}

    private static class SingletonHolder {
        // 由于 JVM 在加载外部类的过程中, 是不会加载静态内部类的, 只有内部类的属性/方法被调用时才会被加载, 并初始化其静态属性。
        private static final Singleton3 INSTANCE = new Singleton3();
    }
    //对外提供静态方法获取该对象
    public static Singleton3 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    // 单例其他的功能实现
    public long add(int a,int b){
        return a+b;
    }
}
