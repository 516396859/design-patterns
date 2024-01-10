package com.cheney.creator.prototypeDemo.depth;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-05 19:24
 * @注释
 */

public class Student {
    private String name;
    private String address;

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
