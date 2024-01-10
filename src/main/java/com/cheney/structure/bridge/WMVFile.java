package com.cheney.structure.bridge;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-06 14:13
 * @注释
 */
public class WMVFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("对"+fileName+"进行WMV格式的解码！");
    }
}
