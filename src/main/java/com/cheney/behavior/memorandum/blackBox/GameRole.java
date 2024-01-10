package com.cheney.behavior.memorandum.blackBox;


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
    public void recoverState(Memento memento) {
        // 要使用实现类必须强转
        RoleStateMemento roleStateMemento = (RoleStateMemento) memento;
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


    // 私有内部类，杜绝外部访问此类
    private class RoleStateMemento implements Memento{
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

}
