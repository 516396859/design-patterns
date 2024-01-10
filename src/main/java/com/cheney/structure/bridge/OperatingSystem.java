package com.cheney.structure.bridge;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-06 14:06
 * @注释 操作系统抽象类
 */
public abstract class OperatingSystem {
    VideoFile videoFile;
    public OperatingSystem(VideoFile videoFile){
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
