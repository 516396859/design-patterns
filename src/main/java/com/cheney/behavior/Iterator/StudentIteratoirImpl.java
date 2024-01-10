package com.cheney.behavior.Iterator;

import java.util.List;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-09 15:09
 * @注释
 */
public class StudentIteratoirImpl implements StudentIterator{
    private List<Student> list;
    private int position = 0;

    public StudentIteratoirImpl(List<Student> list){
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position<list.size();
    }

    @Override
    public Student next() {
        Student student = list.get(position);
        position++;
        return student;
    }
}
