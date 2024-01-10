package com.cheney.structure.adapter.classAdapter;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-06 19:33
 * @注释
 */
public class SDAdapterTF extends TFCardImpl implements SDCard{
    // 特别注意：继承了实现类，实现了SDCard的接口
    @Override
    public String readSD() {
        return super.readTF(); // 调用继承的父类TFCardImpl的方法
    }

    @Override
    public void writeSD(String msg) {
        super.writeTF(msg); // 调用继承的父类TFCardImpl的方法
    }
}
