package com.cheney.behavior.status;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-08 15:49
 * @注释
 */
public class ClosedState extends LiftState{

    public ClosedState(){
        this.setStateName("关闭状态");
    }

    // 电梯闭门(运行)状态，只可以停止
    @Override
    public void stop() {
        // 停止电梯
        System.out.println("电梯运行已经停止...");
        // 修改当前上下文环境，
        StoppedState stoppedState = new StoppedState();
        stoppedState.setContext(this.getContext()); // 当前Context不能变，全局用一个
        this.context.setCurrState(stoppedState);    // 修改当前环境的状态，换状态了！
    }

    @Override
    public void open() {
        System.out.println("不执行任何命令");
    }

    @Override
    public void close() {
        System.out.println("不执行任何命令");
    }

    @Override
    public void run() {
        System.out.println("不执行任何命令");
    }
}
