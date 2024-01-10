package com.cheney.structure.flyweight;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-07 15:33
 * @注释
 */
public abstract class AbstractBox {
    private Character shape;
    private String color;

    public AbstractBox(Character shape){
        this.shape = shape;
    }

    public Character getShape() {
        return shape;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "AbstractBox{" +
                "shape=" + shape +
                ", color='" + color + '\'' +
                '}';
    }
}
