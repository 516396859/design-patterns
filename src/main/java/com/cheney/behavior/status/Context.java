package com.cheney.behavior.status;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-08 15:38
 * @注释 全局只有一个环境变量，维护维护当前状态引用的，可以调用当前状态下的行为
 */
public class Context {

    private LiftState currState;
    public Context(LiftState state){
        this.currState = state;
        this.currState.setContext(this);
    }

    public void setCurrState(LiftState state){
        this.currState = state;
        this.currState.setStateName(state.getStateName());
    }
    public LiftState getCurrState(){
        return this.currState;
    }

    public void open(){
        this.currState.open();
    }
    public void close() {
        this.currState.close();
    }

    public void run() {
        this.currState.run();
    }

    public void stop() {
        this.currState.stop();
    }

}
