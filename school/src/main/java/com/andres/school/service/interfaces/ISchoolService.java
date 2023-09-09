package com.andres.school.service.interfaces;

import com.andres.school.model.School;
import com.andres.school.model.response.FullSchoolResponse;

import java.util.List;

public interface ISchoolService {
    public School saveSchool(School school);
    public List<School> findAllSchools();
    public FullSchoolResponse findSchoolsWithStudents(Integer schoolId);
}
