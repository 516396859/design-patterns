package com.cheney.behavior.Mediator;


/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-09 18:24
 * @注释
 */
public abstract class Mediator {
    private String name;
    public Mediator(String name){
        this.name = name;
    }
    public abstract String constact(String msg,Person person);
}
