package com.cheney.behavior.Mediator;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-09 18:33
 * @注释
 */
public class Tenant extends Person{
    private String lease;
    public Tenant(String name,String lease, Mediator mediator) {
        super(name, mediator);
        this.lease = lease;
    }
    public String getMessage(String msg){
        System.out.println("我是租客，收到了中介发来的信息为："+msg);
        return "我叫" + name +"，我的想租"+lease;
    }
}
