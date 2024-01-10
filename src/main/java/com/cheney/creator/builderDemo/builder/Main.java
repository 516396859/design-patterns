package com.cheney.creator.builderDemo.builder;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-05 18:18
 * @注释
 */
public class Main {
    public static void main(String[] args) {
        // 创建摩拜单车
        Director director = new Director(new MobikeBuilder());
        Bike mobike = director.construct();
        System.out.println(mobike);

        // 创建ofo单车
        director.setBuilder(new OfoBuilder());
        Bike ofobike = director.construct();
        System.out.println(ofobike);
    }
}
