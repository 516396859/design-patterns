package com.cheney.behavior.status;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-08 15:37
 * @注释
 */
public abstract class LiftState {
    private String stateName;
    Context context; // 维护当前的Contex，全局只有一个Context，维护当前的上下文环境
    public String getStateName() {
        return stateName;
    }
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
    public void setContext(Context context){
        this.context = context;
    }
    public Context getContext(){
        return this.context;
    }

    //电梯开门动作
    public abstract void open();

    //电梯关门动作
    public abstract void close();

    //电梯运行动作
    public abstract void run();

    //电梯停止动作
    public abstract void stop();

}
