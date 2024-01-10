package com.cheney.creator.factoryDemo.factoryModel;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-05 15:55
 * @注释
 */
public class CoffeeStore {
    private String name;
    private CoffeeFactory coffeeFactory;
    public CoffeeStore(String name, CoffeeFactory coffeeFactory){
        this.name = name;
        this.coffeeFactory = coffeeFactory;
    }

    public void setCoffeeFactory(CoffeeFactory coffeeFactory){
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee(){
        Coffee coffee = coffeeFactory.createCoffee();
        System.out.println(name+"提供了一杯"+coffee.getName());
        return coffee;
    }
}
