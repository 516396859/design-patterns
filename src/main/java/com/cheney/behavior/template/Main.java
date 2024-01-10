package com.cheney.behavior.template;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-08 14:49
 * @注释
 */
public class Main {
    public static void main(String[] args) {
        // 炒牛肉
        CookBeef cookBeef = new CookBeef();
        cookBeef.cook();

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        // 炒青菜
        CookVegetable cookVegetable = new CookVegetable();
        cookVegetable.cook();
    }
}
