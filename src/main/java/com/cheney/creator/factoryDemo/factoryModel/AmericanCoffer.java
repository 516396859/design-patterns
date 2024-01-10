package com.cheney.creator.factoryDemo.factoryModel;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-05 15:42
 * @注释 制作美式咖啡 3分糖，6分奶
 */
public class AmericanCoffer extends Coffee {
    public AmericanCoffer(){
        this.setName("美式咖啡");
        this.setPrice(19.99);
    }

    @Override
    public void addMilk() {
        this.setMilk(6);
    }

    @Override
    public void addSugar() {
        this.setSugar(3);
    }
}
