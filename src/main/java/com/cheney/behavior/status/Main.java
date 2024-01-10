package com.cheney.behavior.status;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-08 16:17
 * @注释
 */
public class Main {
    public static void main(String[] args) {
        ClosedState closedState = new ClosedState();
        Context context = new Context(closedState);
        System.out.println(context.getCurrState().getStateName());

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        context.stop();
        System.out.println(context.getCurrState().getStateName());

        context.run();
        System.out.println(context.getCurrState().getStateName());

        context.open();
        System.out.println(context.getCurrState().getStateName());

    }
}
