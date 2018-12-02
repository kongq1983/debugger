package com.kq.springioc.entity;

/**
 * Created by qikong on 18/12/2.
 */
public class Teacher {

    private String id;
    private String name;
    private Student student;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
//		return "Teacher [id=" + id + ", name=" + name + ", student=" + student + "]";
        return "Teacher [id=" + id + ", name=" + name + "]";
    }


}
