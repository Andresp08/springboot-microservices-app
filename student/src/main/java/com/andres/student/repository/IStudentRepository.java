package com.andres.student.repository;

import com.andres.student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository<Student,Integer> {

}
