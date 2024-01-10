package com.cheney.creator.builderDemo.builder;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-05 18:19
 * @注释
 */
public class Bike {
    private String name;
    private String frame;
    private String seat;

    public void setName(String name) {
        this.name = name;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "name='" + name + '\'' +
                ", frame='" + frame + '\'' +
                ", seat='" + seat + '\'' +
                '}';
    }
}
