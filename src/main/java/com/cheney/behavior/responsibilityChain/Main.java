package com.cheney.behavior.responsibilityChain;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-08 19:22
 * @注释
 */
public class Main {
    public static void main(String[] args) {
        LeaveRequest leaveRequest = new LeaveRequest("小明", 5, "结婚");

        // 各级别领导
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);

        groupLeader.submit(leaveRequest);

    }
}
