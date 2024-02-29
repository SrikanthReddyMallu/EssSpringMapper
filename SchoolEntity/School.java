package com.example.Mapping.SchoolEntity;

import com.example.Mapping.DepartmentEntity.Employe;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class School
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String schName;
    private String schLocation;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Student> student;

    public School(String schName, String schLocation, List<Student> student) {
        this.schName = schName;
        this.schLocation = schLocation;
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchName() {
        return schName;
    }

    public void setSchName(String schName) {
        this.schName = schName;
    }

    public String getSchLocation() {
        return schLocation;
    }

    public void setSchLocation(String schLocation) {
        this.schLocation = schLocation;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", schName='" + schName + '\'' +
                ", schLocation='" + schLocation + '\'' +
                ", student=" + student +
                '}';
    }
}
