package com.example.Mapping.SchoolRepository;

import com.example.Mapping.DepartmentEntity.Employe;
import com.example.Mapping.SchoolEntity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends CrudRepository<Student,Long>
{
}

