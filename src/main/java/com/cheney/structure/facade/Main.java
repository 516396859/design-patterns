package com.cheney.structure.facade;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-06 13:22
 * @注释
 */
public class Main {
    public static void main(String[] args) {
        ApplicationFacade app = new ApplicationFacade();
        app.say("我回家了");
        app.say("关闭电视");
        app.say("我出门了");
    }
}
