package com.cheney.structure.adapter.objectAdapter;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-06 19:26
 * @注释
 */
public class Computer {
    private String type;
    public String readSDCard(SDCard sdCard){
        if(sdCard==null){
            System.out.println("SD 卡损坏！");
        }
        return sdCard.readSD();
    }

    public void writeSDCard(SDCard sdCard, String msg){
        sdCard.writeSD(msg);
    }
}
