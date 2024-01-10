package com.cheney.structure.bridge;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-06 14:20
 * @注释
 */
public class Main {
    public static void main(String[] args) {
        Windows windows = new Windows(new AVIFile());
        windows.play("哈利波特第三集.avi");
    }
}
