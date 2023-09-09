package com.andres.school.service.implementation;

import com.andres.school.client.StudentClient;
import com.andres.school.model.School;
import com.andres.school.model.response.FullSchoolResponse;
import com.andres.school.model.response.Student;
import com.andres.school.repository.ISchoolRepository;
import com.andres.school.service.interfaces.ISchoolService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class SchoolService implements ISchoolService {

    private final ISchoolRepository schoolRepository;
    private final StudentClient client;

    @Override
    public School saveSchool(School school) {
        return schoolRepository.save(school);
    }
    @Override
    public List<School> findAllSchools(){
        return schoolRepository.findAll();
    }

    @Override
    public FullSchoolResponse findSchoolsWithStudents(Integer schoolId) {
        School school = schoolRepository.findById(schoolId)
                .orElse(
                        School.builder()
                                .name("NOT_FOUND")
                                .email("NOT_FOUND")
                                .build()
                );

        // find all students from student service
        List<Student> students = client.findAllStudentsBySchool(schoolId);
        return FullSchoolResponse.builder()
                .name(school.getName())
                .email(school.getEmail())
                .students(students)
                .build();
    }
}
