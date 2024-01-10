package com.cheney.behavior.Iterator;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-09 15:13
 * @注释
 */
public interface StudentContainer {
    // 添加学生的操作
    void addStudent(Student student);
    // 移除学生
    void removeStudent(Student student);
    // 获取学生迭代器
    StudentIterator getStudentIterator();
}
