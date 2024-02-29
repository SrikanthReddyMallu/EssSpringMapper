package com.example.Mapping.SchoolEntity;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

@Entity
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String stuName;
    private String stuRool;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="school_id")
    private School school;

    public Student(String stuName, String stuRool, School school) {
        this.stuName = stuName;
        this.stuRool = stuRool;
        this.school = school;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuRool() {
        return stuRool;
    }

    public void setStuRool(String stuRool) {
        this.stuRool = stuRool;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stuName='" + stuName + '\'' +
                ", stuRool='" + stuRool + '\'' +
                ", school=" + school +
                '}';
    }
}
