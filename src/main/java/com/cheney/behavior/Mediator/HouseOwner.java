package com.cheney.behavior.Mediator;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-09 18:27
 * @注释
 */
public class HouseOwner extends Person{
    private String address;
    public HouseOwner(String name,String address, Mediator mediator) {
        super(name, mediator);
        this.address = address;
    }

    //获取信息
    public String getMessage(String msg){
        System.out.println("我是房东，收到中介发来的信息："+msg);
        return "我叫" + name +"，房子的位置是"+address;
    }
}
