package com.cheney.creator.builderDemo.builder;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-05 18:18
 * @注释
 */
public abstract class Builder {
    Bike bike = new Bike();

    public abstract void buildFrame();
    public abstract void buildSeat();
    public abstract Bike createBike();
}
