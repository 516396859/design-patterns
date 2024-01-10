package com.cheney.creator.prototypeDemo.shallow;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-05 19:23
 * @注释  浅拷贝
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation c1 = new Citation();
        c1.setName("张三");

        //复制奖状
        Citation c2 = c1.clone();
        //将奖状的名字修改李四
        c2.setName("李四");

        c1.show();
        c2.show();
    }
}
