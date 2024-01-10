package com.cheney.creator.factoryDemo.abstractFactory;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-05 16:38
 * @注释
 */
public class Store {
    private String name;
    public Store(String name){
        this.name = name;
    }

    public Phone orderForPhone(Factory factory){
        return factory.createPhone();
    }

    public Computer orderForComputer(Factory factory){
        return factory.createComputer();
    }

}
