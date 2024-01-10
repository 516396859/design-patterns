package com.cheney.structure.decorator;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-06 15:54
 * @注释
 */
public abstract class Garnish extends FastFood {
    private FastFood fastFood; // 需要装饰的对象
    public FastFood getFastFood() {
        return fastFood;
    }
    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }
    public Garnish(FastFood fastFood,float price,String name){
        super(price,name); // 对象本身是附加的配菜，例如 蛋、培根等
        setFastFood(fastFood); // 设置需要修饰的对象
    }
}
