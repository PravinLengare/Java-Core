package com.pravin.Encapsulation;

class Student {
    private int age;
    private int id;
    private String name;


    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        int age  = 30;                    // This keyword used to diff bet instance and local variable
        student.setAge(age);
        student.setId(10);
        student.setName("Pravin");

        System.out.println(student.getAge());
        System.out.println(student.getId());
        System.out.println(student.getName());

    }
}
