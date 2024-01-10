package com.cheney.behavior.template;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-08 14:39
 * @注释
 */
public abstract class AbstractCook {
    // 做菜很多步骤都一样的，只是关键步骤不一样，
    // 因此，相同步骤作为模板实现好，不同的自己实现
    private String food;
    public AbstractCook(String food){
        this.food = food;
    }

    public void openStove(){
        //1. 开启灶台是相同步骤
        System.out.println("打开灶台，将锅烧热");
    }

    public void pourOil(){
        //2. 倒油是相同步骤
        System.out.println("油倒入锅中，并烧热");
    }

    //3. 翻炒时间和手法不一样
    public abstract void fry();

    //4. 不同菜的调味品不一样
    public abstract void pourSauce();

    //5. 出锅是一样的
    public void takeFood(){
        System.out.println("将炒好的"+food+"盛入餐盘中");
    }

    // final 修饰不被继承
    public final void cook(){
        openStove();
        pourOil();
        fry();
        pourSauce();
        takeFood();
    }
}
