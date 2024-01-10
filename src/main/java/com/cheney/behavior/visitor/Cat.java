package com.cheney.behavior.visitor;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-09 16:14
 * @注释
 */
public class Cat extends Animal {
    public Cat(String name){
        this.setName(name);
    }
    @Override
    public void acceptFoodFrom(Person person) {
        person.feed(this);

    }
}
