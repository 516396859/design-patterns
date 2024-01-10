package com.cheney.structure.facade;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-06 13:22
 * @注释
 */
public class TV {
    private String name;
    private Boolean state;

    public void on(){
        state = true;
        System.out.println("电视被打开");
    }

    public void off(){
        state = false;
        System.out.println("电视被关闭");
    }
}
