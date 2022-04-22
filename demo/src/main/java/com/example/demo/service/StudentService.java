package com.example.demo.service;

import com.example.demo.entities.students;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }
    public List<students> getStudents(){
        return studentRepository.findAll();
    }

    public void addNewStudent(students student) {
        Optional<students> studentByName= studentRepository.findstudentsByName(student.getName());
        if(studentByName.isPresent()){
            throw new IllegalStateException("name already exists");
        }
        studentRepository.save(student);
        System.out.println(student);
    }
    public void deleteStudents(int id){

        boolean studentExists =studentRepository.existsById(id);
        if(!studentExists){
            throw new IllegalStateException("student with id " + id + " does not exist");
        }
        studentRepository.deleteById(id);
    }

    @Transactional
    public void updateStudent(int id, String name) {
        boolean studentExists =studentRepository.existsById(id);
        students studentToUpdate=studentRepository.findStudentById(id)
                .orElseThrow(()-> new IllegalStateException("student with ID "+ id + " does not exist. Unable to update"));
        Optional<students> studentWithThatIdAndName=studentRepository.findStudentByNameAndId(name, id);
        if(name == null){
            throw new IllegalStateException("Name cannot be empty");
        }
        if(studentExists && studentWithThatIdAndName.isPresent()){
            throw new IllegalStateException("New name submitted is same as old name");
        }
        studentToUpdate.setName(name);

    }
}

