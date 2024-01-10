package com.cheney.creator.builderDemo.builder;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-05 18:18
 * @注释
 */
public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Bike construct(){
        builder.buildFrame();
        builder.buildSeat();
        Bike bike = builder.createBike();
        return bike;
    }
}
