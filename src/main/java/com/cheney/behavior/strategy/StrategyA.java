package com.cheney.behavior.strategy;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-08 15:03
 * @注释
 */
public class StrategyA implements Strategy{
    @Override
    public double calculatePrice(double total) {
        // 总价打九折
        System.out.println("策略A：总价打九折");
        return total*0.90;
    }
}
