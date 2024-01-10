package com.cheney.behavior.strategy;


/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-08 15:12
 * @注释
 */
public class JDApp {
    private Strategy strategy;

    public double payment(Strategy strategy,double total){
        return strategy.calculatePrice(total);
    }

}
