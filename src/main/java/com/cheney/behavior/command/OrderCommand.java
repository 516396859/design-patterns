package com.cheney.behavior.command;

import java.util.Set;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-09 19:31
 * @注释
 */
public class OrderCommand implements Command{
    // 命令接受者对象
    private Chef receiver;
    private Order order;
    public OrderCommand(Chef receiver, Order order){
        this.receiver = receiver;
        this.order = order;
    }

    // 命令执行方法
    @Override
    public void execute() {
        System.out.println("订单号："+order.getID());
        Set<String> keys = order.getFoodDic().keySet();
        for (String key : keys) {
            receiver.makeFood(order.getFoodDic().get(key),key);
        }

        try {
            Thread.sleep(100);//停顿一下 模拟做饭的过程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(order.getID() + "订单的饭弄好了");
    }
}
