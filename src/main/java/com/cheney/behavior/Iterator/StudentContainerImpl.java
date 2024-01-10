package com.cheney.behavior.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-09 15:14
 * @注释
 */
public class StudentContainerImpl implements StudentContainer{
    private List<Student> list = new ArrayList<Student>();
    @Override
    public void addStudent(Student student) {
        list.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        list.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratoirImpl(list);
    }
}
