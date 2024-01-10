package com.cheney.behavior.memorandum.whiteBox;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-09 15:40
 * @注释
 */
public class RoleStateMemento {
    private int blood; //血量生命
    private int atk;  //攻击力
    private int def;  //防御力

    public RoleStateMemento(int blood, int atk, int def) {
        this.blood = blood;
        this.atk = atk;
        this.def = def;
    }

    public int getBlood() {
        return blood;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }
}
