package com.cheney.behavior.status;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-08 15:46
 * @注释
 */
public class RunningState extends LiftState{

    public RunningState(){
        this.setStateName("运行状态");
    }
    @Override
    public void open() {
        System.out.println("不执行任何命令");
    }


    @Override
    public void run() {
        System.out.println("不执行任何命令");
    }


    @Override
    public void close() {
        System.out.println("不执行任何命令");
    }

    // 电梯运行时只能停止操作
    @Override
    public void stop() {
        // 关闭电梯门
        System.out.println("电梯运行已经停止...");
        // 修改当前上下文环境
        StoppedState stoppedState = new StoppedState();
        stoppedState.setContext(this.getContext()); // 当前Context不能变，全局用一个
        this.context.setCurrState(stoppedState);    // 修改当前环境的状态，换状态了！
    }
}
