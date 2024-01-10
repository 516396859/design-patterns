package com.cheney.structure.decorator;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-06 15:42
 * @注释
 */
public abstract class FastFood {
    private Float price;
    private String name;

    public FastFood() {
    }

    public FastFood(float price, String name) {
        this.price = price;
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FastFood{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
