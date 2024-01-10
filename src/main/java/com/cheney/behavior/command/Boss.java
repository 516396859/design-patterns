package com.cheney.behavior.command;

import java.util.ArrayList;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-09 19:37
 * @注释
 */
public class Boss {
    private ArrayList<Command> commands;//老板美团可以接很多单，可以持有很多的命令对象

    public Boss() {
        commands = new ArrayList();
    }

    // 不断接单
    public void setCommand(Command cmd){
        commands.add(cmd);
    }

    // 向后厨发出命令您有新的订单，厨师开始执行
    public void orderUp() {
        System.out.println("张师傅，该工作了，新订单来了.......");
        for (int i = 0; i < commands.size(); i++) {
            Command cmd = commands.get(i);
            if (cmd != null) {
                cmd.execute();
            }
        }
    }
}
