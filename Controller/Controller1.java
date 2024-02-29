package com.example.Mapping.Controller;

import com.example.Mapping.SchoolEntity.School;
import com.example.Mapping.SchoolEntity.Student;
import com.example.Mapping.SchoolRepository.SchoolRepo;
import com.example.Mapping.SchoolRepository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller1
{

    @Autowired
    private SchoolRepo schoolRepo;
    @Autowired
    private StudentRepo studentRepo;

    @RequestMapping(value = "/postSchool", method = RequestMethod.POST)
    public School postSchool(@RequestBody School school)
    {
        List<Student> students=school.getStudent();

        School school1=new School(school.getSchName(), school.getSchLocation(), new ArrayList<Student>());

        for(Student student:students){
            student.setSchool(school1);
        }
        school1.setStudent(students);
        return schoolRepo.save(school1) ;
    }

    @RequestMapping(value = "/postSchool1", method = RequestMethod.POST)
    public School postStudent(@RequestBody School school)
    {
        return schoolRepo.save(school);
    }
}
