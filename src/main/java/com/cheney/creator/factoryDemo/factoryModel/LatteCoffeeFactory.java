package com.cheney.creator.factoryDemo.factoryModel;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-05 16:18
 * @注释
 */
public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        LatteCoffee latteCoffee = new LatteCoffee();
        latteCoffee.addMilk();
        latteCoffee.addSugar();
        return latteCoffee;
    }
}
