package com.sms.studentms.service;

import com.sms.studentms.entity.Student;
import com.sms.studentms.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepo repo;

    public List<Student> getAllStudent(){
        return repo.findAll();
    }

    public Student getStudentById(Integer id){
        Optional<Student> studentOptional =  repo.findById(id);
        return studentOptional.get();
    }

}
