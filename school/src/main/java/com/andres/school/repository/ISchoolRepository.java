package com.andres.school.repository;

import com.andres.school.model.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISchoolRepository extends JpaRepository<School,Integer> {

}
