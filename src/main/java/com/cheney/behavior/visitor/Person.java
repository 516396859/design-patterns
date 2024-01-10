package com.cheney.behavior.visitor;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-09 16:13
 * @注释
 */
public abstract class Person {
    private String name;
    public abstract void feed(Cat cat);
    public abstract void feed(Dog dog);
}
