package com.cheney.behavior.status;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-08 15:42
 * @注释
 */
public class OpenedState extends LiftState{
    public OpenedState(){
        this.setStateName("开启状态");
    }

    // 电梯门开着的状态下(停止)只能关门操作
    @Override
    public void close() {
        // 关闭电梯门
        System.out.println("电梯门已经关闭...");
        // 修改当前上下文环境
        ClosedState closedState = new ClosedState();
        closedState.setContext(this.getContext()); // 当前Context不能变，全局用一个
        this.context.setCurrState(closedState);    // 修改当前环境的状态，换状态了！
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
    public void stop() {
        System.out.println("不执行任何命令");
    }
}
