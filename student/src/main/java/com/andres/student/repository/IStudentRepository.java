package com.andres.student.repository;

import com.andres.student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IStudentRepository extends JpaRepository<Student,Integer> {
    public List<Student> findAllBySchoolId(Integer schoolId);
}
