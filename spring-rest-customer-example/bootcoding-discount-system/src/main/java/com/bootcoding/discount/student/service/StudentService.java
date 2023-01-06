package com.bootcoding.discount.student.service;

import com.bootcoding.discount.student.model.StudentData;
import com.bootcoding.discount.utils.NameGenerator;
import org.springframework.stereotype.Service;
import com.bootcoding.discount.student.utils.IdGenertor;
import com.bootcoding.discount.student.utils.MarksGenertor;
import com.bootcoding.discount.student.utils.RollGenertor;

import java.util.ArrayList;
import java.util.List;
@Service
public class StudentService {

    public static List<StudentData> getAllStudentData() {
        List<StudentData> studentsData = new ArrayList<>();
        for (int i=0; i<10;i++){
            StudentData  studentData = createStudent();
            studentsData.add(studentData);
        }
        return studentsData;
    }

    private static StudentData createStudent() {
        StudentData studentData = new StudentData();
        studentData.setStudentName(NameGenerator.getName());
        studentData.setId(IdGenertor.getId());
        studentData.setRollNo(RollGenertor.getRollNo());
        studentData.setMarks(MarksGenertor.getMarks());

        return studentData;

    }
}
