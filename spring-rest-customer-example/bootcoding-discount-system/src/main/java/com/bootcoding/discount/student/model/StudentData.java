package com.bootcoding.discount.student.model;

import org.springframework.stereotype.Component;

@Component
public class StudentData {
    private int marks;

    public int getMarks() {

        return marks;
    }

    public void setMarks(int marks) {

        this.marks = marks;
    }

    private int rollNo;

    public int getRollNo() {

        return rollNo;
    }

    public void setRollNo(int rollNo) {

        this.rollNo = rollNo;
    }

    public String getStudentName() {

        return studentName;
    }

    public void setStudentName(String studentName) {

        this.studentName = studentName;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    private String studentName;
    private int id;

}
