package com.cheney.creator.factoryDemo.sampleFactory;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-05 15:52
 * @注释 简单工厂模式——咖啡工厂类
 */
public class SimpleCoffeeFactory {
    public static Coffee createrCoffee(String type){
        Coffee coffee = null;
        switch (type){
            case "拿铁":
                coffee = new LatteCoffee();
                break;
            case "美式":
                coffee = new AmericanCoffer();
                break;
            default:
                System.out.println("这种咖啡本店没有！");
        }
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
