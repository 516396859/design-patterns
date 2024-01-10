package com.cheney.structure.flyweight;

import javax.swing.*;
import java.util.HashMap;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-07 15:38
 * @注释
 */
public class BoxFactory {
    private static HashMap<Character,AbstractBox> map;

    private BoxFactory(){
        map = new HashMap<>();
        IBox iBox = new IBox();
        LBox lBox = new LBox();
        ZBox zBox = new ZBox();
        map.put('I',iBox);
        map.put('L',lBox);
        map.put('Z',zBox);
    }

    private static class SingletonHolder{
        // 静态内部类实现单例模式
        private static final BoxFactory INSTANCE = new BoxFactory();
    }

    public static final BoxFactory getInstance(){
        return SingletonHolder.INSTANCE;
    }
    public AbstractBox getBox(Character c){
        return map.get(c);
    }
}
