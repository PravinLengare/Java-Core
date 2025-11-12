package com.pravin.Constuctor;

class Student {
    private int age;
    private int id;
    private String name;

    public Student(){
        System.out.println("in constructor");
    }

    public Student(int age,int id,String name){
        this.age = age;
        this.id = id;
        this.name = name;
    }

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

    public String toString() {
        return "Student{" +
                "age=" + getAge() +
                ", id=" + getId() +
                ", name='" + getName() + '\'' +
                '}';
    }
}

class A{
     A(){
         System.out.println("Object called !!");
     }

}

public class Constructor {

    public static void main(String[] args) {
         Student student = new Student();
         Student student1 = new Student(12,32,"Pravin");



        //System.out.println( student1.getName() + " " +student1.getId() +" "+ student1.getAge());

        new A();     // anonymous object creation
    }
}
