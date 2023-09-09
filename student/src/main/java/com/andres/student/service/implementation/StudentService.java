package com.andres.student.service.implementation;

import com.andres.student.model.Student;
import com.andres.student.repository.IStudentRepository;
import com.andres.student.service.interfaces.IStudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService implements IStudentService {

    private final IStudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
    @Override
    public List<Student> findAllStudents(){
        return studentRepository.findAll();
    }
}
