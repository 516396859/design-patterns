package com.cheney.creator.builderDemo.expansion;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-05 19:10
 * @注释
 */
public class Computer {
    private String cpu;
    private String gpu;
    private String memory;
    private String mainBoard;
    private String screen;

    // 禁止外部直接使用构造方法创建对象
    private Computer(Builder builder){
        cpu = builder.cpu;
        gpu = builder.gpu;
        memory = builder.memory;
        mainBoard = builder.mainBoard;
        screen = builder.screen;
    }

    // 静态内部类
    public static final class Builder{
        private String cpu;
        private String gpu;
        private String memory;
        private String mainBoard;
        private String screen;

        public Builder cpu(String val){
            cpu = val;
            return this;
        }
        public Builder gpu(String val){
            gpu = val;
            return this;
        }
        public Builder memory(String val){
            memory = val;
            return this;
        }
        public Builder mainBoard(String val){
            mainBoard = val;
            return this;
        }
        public Builder screen(String val){
            screen = val;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", memory='" + memory + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }
}
