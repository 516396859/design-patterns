package com.cheney.behavior.memorandum.whiteBox;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-09 15:36
 * @注释
 */
public class GameRole {
    private int blood; //血量生命
    private int atk;  //攻击力
    private int def;  //防御力

    // 初始化状态
    public void initState(){
        this.blood =100;
        this.atk = 100;
        this.def = 100;
    }
    // 保存角色状态
    public RoleStateMemento saveState(){
        return new RoleStateMemento(blood,atk,def);
    }

    // 加载角色状态
    public void recoverState(RoleStateMemento roleStateMemento) {
        this.blood = roleStateMemento.getBlood();
        this.atk = roleStateMemento.getAtk();
        this.def = roleStateMemento.getDef();
    }

    // 显示角色状态
    public void showRoleState(){
        System.out.println("角色生命力：" + blood);
    }

    public void setBlood(int val){
        this.blood = val;
    }

}
