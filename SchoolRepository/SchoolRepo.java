package com.example.Mapping.SchoolRepository;

import com.example.Mapping.DepartmentEntity.Department;
import com.example.Mapping.SchoolEntity.School;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepo extends CrudRepository<School,Long> {
}
