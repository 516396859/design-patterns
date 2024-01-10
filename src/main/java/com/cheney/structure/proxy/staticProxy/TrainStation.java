package com.cheney.structure.proxy.staticProxy;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-07 13:46
 * @注释
 */
public class TrainStation implements SellTickets{
    @Override
    public void sell() {
        System.out.println("收取200元，火车站卖票成功！");
    }
}
