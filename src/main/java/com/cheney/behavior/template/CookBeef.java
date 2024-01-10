package com.cheney.behavior.template;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-08 14:54
 * @注释
 */
public class CookBeef extends AbstractCook{
    public CookBeef() {
        super("贵州黄牛肉");
    }

    @Override
    public void fry() {
        System.out.println("牛肉下锅，总共炒10分钟，每个30秒翻一下");
    }

    @Override
    public void pourSauce() {
        System.out.println("放盐和味精，其他放酱油、蒜末、辣椒、葱花去腥提鲜");
    }
}
