package com.cheney.structure.proxy.staticProxy;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-07 13:47
 * @注释
 */
public class ProxyStation implements SellTickets{
    @Override
    public void sell() {
        System.out.println("收取210元，代理卖票成功！");
    }
}
