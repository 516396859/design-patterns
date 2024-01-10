package com.cheney.structure.facade;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-06 13:23
 * @注释
 */
public class ApplicationFacade {
    private Light light;
    private TV tv;
    private AirCondition airCondition;

    public ApplicationFacade() {
        light = new Light();
        tv = new TV();
        airCondition = new AirCondition();
    }

    private void onAll() {
        light.on();
        tv.on();
        airCondition.on();
    }

    private void offAll() {
        light.off();
        tv.off();
        airCondition.off();
    }

    public void say(String msg) {
        switch (msg) {
            case "我回家了":
                onAll();
                break;
            case "我出门了":
                offAll();
                break;
            case "打开电视":
                tv.on();
                break;
            case "关闭电视":
                tv.off();
                break;
            case "打开空调":
                airCondition.on();
                break;
            case "关闭空调":
                airCondition.off();
                break;
            case "打开灯":
                light.on();
                break;
            case "关闭灯":
                light.off();
                break;
            default:
                System.out.println("我听不懂你在说什么");
        }
    }
}
