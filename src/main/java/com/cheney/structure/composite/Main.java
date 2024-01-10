package com.cheney.structure.composite;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-07 18:17
 * @注释
 */
public class Main {
    public static void main(String[] args) {
        MenuItem food1 = new MenuItem("烤肥牛", 3);
        MenuItem food2 = new MenuItem("烤牛肉", 3);
        MenuItem food3 = new MenuItem("烤鸡腿", 3);

        Menu meatMenu = new Menu("荤菜", 2);
        meatMenu.add(food1);
        meatMenu.add(food2);
        meatMenu.add(food3);

        MenuItem food4 = new MenuItem("烤韭菜", 3);
        MenuItem food5 = new MenuItem("烤香菇", 3);
        MenuItem food6 = new MenuItem("烤茄子", 3);

        Menu vegeMenu = new Menu("蔬菜", 2);
        vegeMenu.add(food4);
        vegeMenu.add(food5);
        vegeMenu.add(food6);

        Menu menu = new Menu("烧烤类", 1);
        menu.add(meatMenu);
        menu.add(vegeMenu);

        menu.print();
    }
}
