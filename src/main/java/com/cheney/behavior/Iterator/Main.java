package com.cheney.behavior.Iterator;

import java.util.ArrayList;

/**
 * @version 1.0
 * @Author Chenjie
 * @Date 2024-01-09 15:16
 * @注释
 */
public class Main {
    public static void main(String[] args) {

        // 测试迭代器类
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("张三",17));
        students.add(new Student("李四",19));
        students.add(new Student("王五",18));

        StudentIteratoirImpl iter = new StudentIteratoirImpl(students);
        while (iter.hasNext()){
            Student s = iter.next();
            System.out.println(s);
        }

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        // 测试学生容器类
        StudentContainerImpl studentContainer = new StudentContainerImpl();
        studentContainer.addStudent(new Student("张三",17));
        studentContainer.addStudent(new Student("李四",19));
        studentContainer.addStudent(new Student("王五",18));
        StudentIterator studentIterator = studentContainer.getStudentIterator();
        while (studentIterator.hasNext()){
            Student s = studentIterator.next();
            System.out.println(s);
        }


    }
}
