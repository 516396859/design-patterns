package com.cheney.structure.adapter.objectAdapter;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-06 19:33
 * @注释
 */
public class SDAdapterTF implements SDCard {
    private TFCard tfCard;
    public SDAdapterTF(TFCard tfCard){
        this.tfCard = tfCard;
    }
    @Override
    public String readSD() {
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        tfCard.writeTF(msg);
    }
}
