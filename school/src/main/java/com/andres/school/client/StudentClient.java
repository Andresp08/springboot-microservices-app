package com.andres.school.client;

import com.andres.school.model.response.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "student-service", url = "${application.config.students-url}")
public interface StudentClient {
    @GetMapping(value = "/school/{school-id}")
    public List<Student> findAllStudentsBySchool(@PathVariable("school-id") Integer schoolId);
}
