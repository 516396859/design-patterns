package com.cheney.creator.builderDemo.builder;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-05 18:25
 * @注释
 */
public class MobikeBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮座椅");
    }

    @Override
    public Bike createBike() {
        bike.setName("Mobike单车");
        return bike;
    }
}
