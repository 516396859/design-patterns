package com.cheney.creator.factoryDemo.sampleFactory;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-05 15:51
 * @注释
 */
public class LatteCoffee extends Coffee {
    public LatteCoffee(){
        this.setName("拿铁咖啡");
        this.setPrice(21.99);
    }

    @Override
    public void addMilk() {
        this.setMilk(3);
    }

    @Override
    public void addSugar() {
        this.setSugar(7);
    }
}
