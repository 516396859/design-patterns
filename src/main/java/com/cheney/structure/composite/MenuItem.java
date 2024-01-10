package com.cheney.structure.composite;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-07 18:16
 * @注释
 */
public class MenuItem extends MenuComponent{
    //MenuItem是菜单项，不能再有子菜单，
    // 所以添加菜单，移除菜单和获取子菜单的功能并不能实现。
    public MenuItem(String name,int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        for (int i = 1; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
    }
}
