package com.cheney.behavior.memorandum.blackBox;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-09 16:00
 * @注释
 */
public class Main {
    public static void main(String[] args) {
        // 开始游戏
        GameRole role = new GameRole();
        role.initState();
        role.showRoleState();

        System.out.println("--------打boss受伤...");
        // 打boss，只剩下30血量
        role.setBlood(30);
        role.showRoleState();

        // 存档数据
        System.out.println("--------游戏存档...");
        // 如果没有Memento接口下面这个肯定报错，因为内部类是私有的
        // GameRole.RoleStateMemento roleStateMemento = role.saveState();
        Memento memento = role.saveState(); // 多态牛逼

        // 继续战斗
        System.out.println("--------继续打boss");
        role.setBlood(0);
        role.showRoleState();
        System.out.println("--------战斗死亡！");

        // 恢复存档
        System.out.println("--------恢复存档...");
        role.recoverState(memento);
        role.showRoleState();
    }
}
