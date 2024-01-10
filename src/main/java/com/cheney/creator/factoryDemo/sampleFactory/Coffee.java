package com.cheney.creator.factoryDemo.sampleFactory;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-05 15:36
 * @注释  假设加的糖和奶不一样就是不一样的咖啡
 */

public abstract class Coffee {
    private String name;
    private Double price;
    private int milk;
    private int sugar;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", milk=" + milk +
                ", sugar=" + sugar +
                '}';
    }

    public abstract void addMilk();

    public abstract void addSugar();

}
