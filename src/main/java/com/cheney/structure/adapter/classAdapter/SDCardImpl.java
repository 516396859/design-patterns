package com.cheney.structure.adapter.classAdapter;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-06 19:29
 * @注释
 */
public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        return "SD卡读出内容：Hello World!";
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SD卡写入内容："+msg);
    }
}
