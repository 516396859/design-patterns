package com.cheney.creator.singletonDemo;

import org.junit.Test;
public class Main {
    @Test
    public void testSingleton1(){
        // 测试 Singleton1
        Singleton1 instance1 = Singleton1.getInstance();
        // 使用单例对象
        long res1 = instance1.add(1, 2);
        System.out.println(res1);
        System.out.println(Singleton1.getInstance()==instance1);
    }

    @Test
    public void testSingleton2(){
        // 测试 Singleton2
        Singleton2 instance = Singleton2.getInstance();
        // 使用单例对象
        long res1 = instance.add(1, 2);
        System.out.println(res1);
        System.out.println(Singleton2.getInstance()==instance);
    }

    @Test
    public void testSingleton3(){
        // 测试 Singleton3
        Singleton3 instance = Singleton3.getInstance();
        // 使用单例对象
        long res1 = instance.add(1, 2);
        System.out.println(res1);
        System.out.println(Singleton3.getInstance()==instance);
    }

    @Test
    public void testSingleton4(){
        Singleton4 instance = Singleton4.INSTANCE;
        // 使用单例对象
        long res1 = instance.add(1, 2);
        System.out.println(res1);
        System.out.println(Singleton4.INSTANCE==instance);
    }

    @Test
    public void testSingleton5(){
        // 测试 Singleton3
        Singleton5 instance = Singleton5.getInstance();
        // 使用单例对象
        long res1 = instance.add(1, 2);
        System.out.println(res1);
        System.out.println(Singleton5.getInstance()==instance);
    }
}
