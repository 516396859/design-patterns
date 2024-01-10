package com.cheney.creator.builderDemo.expansion;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-05 19:16
 * @注释
 */
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .cpu("Apple M3")
                .gpu("英伟达4090ti")
                .mainBoard("华硕主板")
                .memory("长江存储")
                .screen("京东方大猩猩")
                .build();
        System.out.println(computer);
    }
}
