package com.cheney.creator.factoryDemo.sampleFactory;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-05 15:57
 * @注释  简单工厂模式，以咖啡为例
 */
public class Main {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore("黄河路咖啡店");
        Coffee coffee = coffeeStore.orderCoffee("拿铁");
        System.out.println(coffee);
    }
}
