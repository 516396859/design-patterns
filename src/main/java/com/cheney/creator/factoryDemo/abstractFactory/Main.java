package com.cheney.creator.factoryDemo.abstractFactory;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-05 16:37
 * @注释
 */
public class Main {
    public static void main(String[] args) {
        Store store = new Store("南京路电子城");
        // 购买iphone手机
        Phone iphone = store.orderForPhone(new AppleFactory());
        System.out.println(iphone);

        // 购买华为电脑
        Computer hwcomputer = store.orderForComputer(new HuaweiFactory());
        System.out.println(hwcomputer);
    }
}
