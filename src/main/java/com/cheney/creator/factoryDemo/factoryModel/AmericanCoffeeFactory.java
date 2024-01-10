package com.cheney.creator.factoryDemo.factoryModel;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-05 16:20
 * @注释
 */
public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        AmericanCoffer americanCoffer = new AmericanCoffer();
        americanCoffer.addMilk();
        americanCoffer.addSugar();
        return americanCoffer;
    }
}
