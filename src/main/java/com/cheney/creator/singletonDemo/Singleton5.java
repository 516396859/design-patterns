package com.cheney.creator.singletonDemo;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-05 15:28
 * @注释 双重检查方式 DCL（懒汉式加载、线程安全、效率不高） 不推荐使用
 */
public class Singleton5 {
    //私有构造方法
    private Singleton5() {}
    // volatile 关键字可以保证可见性和有序性。
    private static volatile Singleton5 instance;

    //对外提供静态方法获取该对象
    public static Singleton5 getInstance() {
        //第一次判断，如果instance不为null，不进入抢锁阶段，直接返回实例
        if(instance == null) {
            synchronized (Singleton5.class) {
                //抢到锁之后再次判断是否为null
                if(instance == null) {
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }
    // 单例其他的功能实现
    public long add(int a,int b){
        return a+b;
    }
}
