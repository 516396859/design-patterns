package com.cheney.creator.factoryDemo.abstractFactory;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-05 16:37
 * @注释
 */
public class HuaweiFactory implements Factory{
    @Override
    public Phone createPhone() {
        HuaweiPhone huaweiPhone = new HuaweiPhone();
        return huaweiPhone;
    }

    @Override
    public Computer createComputer() {
        HuaweiComputer huaweiComputer = new HuaweiComputer();
        return huaweiComputer;
    }
}
