package com.cheney.structure.decorator;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-06 16:15
 * @注释
 */
public class Main {
    public static void main(String[] args) {
        // 点一份炒饭 10元
        FriedRice friedRice = new FriedRice();
        System.out.println(friedRice.getName()+":价格"+friedRice.getPrice()+"元");

        // 加蛋 加2元
        Egg eggFriedRice = new Egg(friedRice);
        System.out.println(eggFriedRice.getName()+":价格"+eggFriedRice.getPrice()+"元");

        // 点个培根炒面 13+3=16元
        Bacon baconFriedRice = new Bacon(new FriedNoodles());
        System.out.println(baconFriedRice.getName()+":价格"+baconFriedRice.getPrice()+"元");
    }
}
