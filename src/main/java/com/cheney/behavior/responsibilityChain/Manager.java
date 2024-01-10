package com.cheney.behavior.responsibilityChain;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-08 19:21
 * @注释
 */
public class Manager extends Handler {
    public Manager() {
        //部门经理处理4-7天的请假
        super(Handler.NUM_THREE+1, Handler.NUM_SEVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天," + leave.getContent() + "。");
        System.out.println("部门经理审批：同意。");
    }
}
