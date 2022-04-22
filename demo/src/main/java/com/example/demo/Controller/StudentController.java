package com.example.demo.Controller;

import com.example.demo.entities.students;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/student")
public class StudentController {

    private final StudentService studentSvc;

    @Autowired
    public StudentController(StudentService studentSvc){
    this.studentSvc=studentSvc;
    }

    @GetMapping
    public List<students> getStudents(){
        return studentSvc.getStudents();
    }

    @PostMapping
    public void addNewStudent(@RequestBody students student){
        studentSvc.addNewStudent(student);
    }
    @DeleteMapping(path="{studentId}")
    public void deleteStudent(@PathVariable("studentId") int id){
        studentSvc.deleteStudents(id);
    }
    @PutMapping(path="{studentId}")
    public void updateStudent(@RequestBody students students,@PathVariable("studentId") int id){
        studentSvc.updateStudent(id,students.getName());
    }
}
