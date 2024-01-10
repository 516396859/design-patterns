package com.cheney.behavior.responsibilityChain;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-08 19:22
 * @注释
 */
public class GeneralManager extends Handler{
    public GeneralManager() {
        //部门经理处理7天以上的请假
        super(Handler.NUM_SEVEN+1,365);
    }

    @Override
    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天," + leave.getContent() + "。");
        System.out.println("总经理审批：同意。");
    }
}
