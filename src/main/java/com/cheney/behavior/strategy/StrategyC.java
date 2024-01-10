package com.cheney.behavior.strategy;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-08 15:08
 * @注释
 */
public class StrategyC implements Strategy {
    @Override
    public double calculatePrice(double total) {
        // 3000减600 优惠券一张，不与参与其他优惠
        System.out.println("策略C：3000减600大额优惠券一张，不与参与其他优惠");
        if(total>=3000){
            return total-600;
        }else {
            return total;
        }
    }
}
