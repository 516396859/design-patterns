package com.cheney.behavior.strategy;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-08 15:04
 * @注释
 */
public class StrategyB implements Strategy{
    @Override
    public double calculatePrice(double total) {
        // 每满300减30，每满1000减200
        System.out.println("策略B：每满300减30，每满1000减200");
        int numK = (int)total / 1000;
        int num300 = (int)(total-numK*1000) / 300;
        total = total - numK*200 - num300*30;
        return total;
    }
}
