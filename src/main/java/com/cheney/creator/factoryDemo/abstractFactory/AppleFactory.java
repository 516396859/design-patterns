package com.cheney.creator.factoryDemo.abstractFactory;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-05 16:35
 * @注释
 */
public class AppleFactory implements Factory {
    @Override
    public Phone createPhone() {
        iPhone iPhone = new iPhone();
        return iPhone;
    }

    @Override
    public Computer createComputer() {
        MacConputer macConputer = new MacConputer();
        return macConputer;
    }
}
