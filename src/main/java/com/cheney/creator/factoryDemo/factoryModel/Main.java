package com.cheney.creator.factoryDemo.factoryModel;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-05 16:05
 * @注释  工厂方法模式，以咖啡为例
 */
public class Main {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore("黄河路咖啡店",new AmericanCoffeeFactory());
        Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee);

        coffeeStore.setCoffeeFactory(new LatteCoffeeFactory());
        coffee = coffeeStore.orderCoffee();
        System.out.println(coffee);
    }
}
