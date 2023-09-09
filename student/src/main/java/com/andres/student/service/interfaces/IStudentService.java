package com.andres.student.service.interfaces;

import com.andres.student.model.Student;

import java.util.List;

public interface IStudentService {
    public Student saveStudent(Student student);
    public List<Student> findAllStudents();
}
