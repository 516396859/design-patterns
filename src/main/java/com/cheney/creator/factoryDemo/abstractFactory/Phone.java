package com.cheney.creator.factoryDemo.abstractFactory;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-05 16:28
 * @注释
 */
public abstract class Phone {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                '}';
    }

    public void Show(){
        System.out.println(name+"手机"+"，用过的都说好！");
    }
}
