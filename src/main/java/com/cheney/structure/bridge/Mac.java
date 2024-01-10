package com.cheney.structure.bridge;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-06 14:19
 * @注释
 */
public class Mac extends OperatingSystem{
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
        System.out.println("播放解码后的视频文件！");
    }
}
