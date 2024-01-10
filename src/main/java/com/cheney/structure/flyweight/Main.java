package com.cheney.structure.flyweight;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-07 15:42
 * @注释
 */
public class Main {
    public static void main(String[] args) {
        BoxFactory instance = BoxFactory.getInstance();
        AbstractBox ibox = instance.getBox('I');
        System.out.println(ibox);
        ibox.setColor("Red");
        System.out.println(ibox);
        System.out.println(instance.getBox('Z'));
        System.out.println(instance.getBox('L'));
    }
}
