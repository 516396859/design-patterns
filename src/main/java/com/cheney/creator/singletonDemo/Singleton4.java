package com.cheney.creator.singletonDemo;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-05 15:25
 * @注释 枚举类实现单例模式（线程安全、懒汉式、不被破坏）
 */
public enum Singleton4 {
    INSTANCE;
    // 单例其他的功能实现
    public long add(int a,int b){
        return a+b;
    }
}
