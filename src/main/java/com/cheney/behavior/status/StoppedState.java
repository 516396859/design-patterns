package com.cheney.behavior.status;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-08 15:47
 * @注释
 */
public class StoppedState extends LiftState {
    public StoppedState(){
        this.setStateName("停止状态");
    }
    // 电梯停止状态(假设停止状态是关闭门的停止)只能开门或者继续运行
    @Override
    public void open() {
        // 电梯门打开
        System.out.println("电梯门已经打开...");
        // 修改当前上下文环境
        OpenedState openedState = new OpenedState();
        openedState.setContext(this.getContext()); // 当前Context不能变，全局用一个
        this.context.setCurrState(openedState);    // 修改当前环境的状态，换状态了！
    }


    @Override
    public void run() {
        // 启动电梯
        System.out.println("电梯运行开始启动...");
        // 修改当前上下文环境
        RunningState runningState = new RunningState();
        runningState.setContext(this.getContext()); // 当前Context不能变，全局用一个
        this.context.setCurrState(runningState);    // 修改当前环境的状态，换状态了！
    }

    @Override
    public void stop() {
        System.out.println("不执行任何命令");
    }


    @Override
    public void close() {
        System.out.println("不执行任何命令");
    }
}
