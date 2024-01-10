package com.cheney.behavior.memorandum.whiteBox;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-09 15:44
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
        RoleStateMemento roleStateMemento = role.saveState();

        // 继续战斗
        System.out.println("--------继续打boss");
        role.setBlood(0);
        role.showRoleState();
        System.out.println("--------战斗死亡！");

        // 恢复存档
        System.out.println("--------恢复存档...");
        role.recoverState(roleStateMemento);
        role.showRoleState();

    }
}
