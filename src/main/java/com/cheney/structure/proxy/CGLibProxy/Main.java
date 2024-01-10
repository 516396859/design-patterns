package com.cheney.structure.proxy.CGLibProxy;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-07 14:11
 * @注释
 */
public class Main {
    public static void main(String[] args) {
        //创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        //获取代理对象
        TrainStation proxyObject = factory.getProxyObject();
        proxyObject.sell();
    }
}
