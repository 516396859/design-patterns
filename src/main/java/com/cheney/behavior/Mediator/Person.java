package com.cheney.behavior.Mediator;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-09 18:25
 * @注释
 */

// 抽象同事类
public abstract class Person {
    protected String name;
    protected Mediator mediator;
    public Person(String name,Mediator mediator){
        this.name = name;
        this.mediator = mediator;
    }

    public abstract String getMessage(String msg);
}
