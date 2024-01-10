package com.cheney.behavior.visitor;


/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-09 16:11
 * @注释
 */
public abstract class Animal {
    private String name;
    public abstract void acceptFoodFrom(Person person);

    public void setName(String name) {
        this.name = name;
    }
}
