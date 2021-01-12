package com.ocp17_gc;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student {
    String name;
    public Student(String name) { // 建構子
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " 離開(被 GC 吞吃)");
    }
    
    @Override
    public String toString() {
        return "\nStudent{" + "name=" + name + '}';
    }
}

public class Classroom {
    public static void main(String[] args) {
        Faker faker = new Faker();
        List<Student> students = new ArrayList<>();
        for(int i=0;i<10;i++) {
            students.add(new Student(faker.name().lastName()));
        }
        System.out.println(students);
        // 移除有 s 或 S 的人名
        Iterator<Student> iter = students.iterator();
        while (iter.hasNext()) {
            Student student = iter.next();
            if(student.name.contains("s") || student.name.contains("S")) {
                iter.remove();
                student = null;
                System.gc();
            }
        }
        System.out.println(students);
    }
}
