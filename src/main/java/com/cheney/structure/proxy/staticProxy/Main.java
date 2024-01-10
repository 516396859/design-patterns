package com.cheney.structure.proxy.staticProxy;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-07 13:48
 * @注释
 */
public class Main {
    public static void main(String[] args) {

        TrainStation trainStation = new TrainStation();
        trainStation.sell();

        ProxyStation proxyStation = new ProxyStation();
        proxyStation.sell();
    }
}
