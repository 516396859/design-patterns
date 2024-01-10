package com.cheney.structure.proxy.JDKProxy;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-07 13:57
 * @注释
 */
public class Main {
    public static void main(String[] args) {
        //获取代理对象
        ProxyFactory factory = new ProxyFactory();
        SellTickets proxyObject = factory.getProxyObject();
        proxyObject.sell();
    }
}
