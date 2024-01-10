package com.cheney.behavior.template;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-08 14:55
 * @注释
 */
public class CookVegetable extends AbstractCook{
    public CookVegetable() {
        super("青菜");
    }

    @Override
    public void fry() {
        System.out.println("蔬菜下锅，总共炒2分钟，每个5秒翻一下");
    }

    @Override
    public void pourSauce() {
        System.out.println("放盐和味精，其他放耗油即可");
    }
}
