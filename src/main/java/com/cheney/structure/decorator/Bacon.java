package com.cheney.structure.decorator;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-06 16:09
 * @注释
 */
public class Bacon extends Garnish{

    public Bacon(FastFood fastFood) {
        super(fastFood, 3, "培根");
    }
    @Override
    public Float getPrice() {
        // 需要装饰对象的价格（炒饭或者炒面的价格）+装饰的价格（配菜培根的价格）
        return this.getFastFood().getPrice()+super.getPrice();
    }

    @Override
    public String getName(){
        return super.getName()+this.getFastFood().getName();
    }
}
