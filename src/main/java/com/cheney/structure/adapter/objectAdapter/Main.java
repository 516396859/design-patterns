package com.cheney.structure.adapter.objectAdapter;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-06 19:32
 * @注释
 */
public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer();

        // 对于SD卡是可以直接读取的
        SDCardImpl sdCard = new SDCardImpl();
        String msg = computer.readSDCard(sdCard);
        System.out.println(msg);
        computer.writeSDCard(sdCard,"你好，世界!");

        // 对于TF卡需要是有适配器类读取
        TFCard tfCard = new TFCardImpl();
        SDAdapterTF sdAdapterTF = new SDAdapterTF(tfCard);
        msg = computer.readSDCard(sdAdapterTF);
        System.out.println(msg);
        computer.writeSDCard(sdAdapterTF,"你好世界！");


    }
}
