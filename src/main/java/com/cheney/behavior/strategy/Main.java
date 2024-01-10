package com.cheney.behavior.strategy;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-08 15:15
 * @注释
 */
public class Main {
    public static void main(String[] args) {

        double total = 3200;

        JDApp jdApp = new JDApp();
        double straA = jdApp.payment(new StrategyA(), total);
        System.out.println(straA);

        double straB = jdApp.payment(new StrategyB(), total);
        System.out.println(straB);

        double straC = jdApp.payment(new StrategyC(), total);
        System.out.println(straC);
    }
}
