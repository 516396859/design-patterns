package com.cheney.creator.factoryDemo.sampleFactory;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-05 15:55
 * @注释
 */
public class CoffeeStore {
    String name;
    public CoffeeStore(String name){
        this.name = name;
    }
    public Coffee orderCoffee(String type){
        Coffee coffee = SimpleCoffeeFactory.createrCoffee(type);
        System.out.println(name+"提供了一杯"+coffee.getName());
        return coffee;
    }
}
