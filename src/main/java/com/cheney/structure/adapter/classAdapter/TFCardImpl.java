package com.cheney.structure.adapter.classAdapter;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-06 19:32
 * @注释
 */
public class TFCardImpl implements TFCard{
    @Override
    public String readTF() {
        return "TF卡读出内容：Hello World!";
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("TF卡写入内容："+msg);
    }
}
