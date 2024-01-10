package com.cheney.behavior.observer;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-08 20:08
 * @注释
 */
public class WeChatUser implements Observer{
    private String name;
    public WeChatUser(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println("通过网络将 '"+msg+"' 发送给了"+name);
    }
}
