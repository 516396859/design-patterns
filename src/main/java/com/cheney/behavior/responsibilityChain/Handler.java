package com.cheney.behavior.responsibilityChain;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-08 19:09
 * @注释 处理者抽象类
 */
public abstract class Handler {
    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;

    //该领导处理的请假天数区间
    private int numStart;
    private int numEnd;
    //领导上面还有领导
    private Handler nextHandler;
    //设置请假天数范围
    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    //设置上级领导
    public void setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
    }
    //各级领导处理请假条方法
    protected abstract void handleLeave(LeaveRequest leave);

    //提交请假条
    public final void submit(LeaveRequest leave){
        //如果请假天数达到该领导者的处理要求
        if(leave.getNum() >= this.numStart){
            if(leave.getNum()<=this.numEnd){
                this.handleLeave(leave); //本级领导处理
            }
            //如果还有上级 并且请假天数超过了当前领导的处理范围
            if(null != this.nextHandler && leave.getNum() > numEnd){
                this.nextHandler.submit(leave);//继续提交
            } else {
                System.out.println("流程结束");
            }
        }
    }

}
