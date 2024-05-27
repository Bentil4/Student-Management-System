package com.StudentMSystem.Controllers;

import com.StudentMSystem.Models.Student;
import com.StudentMSystem.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

//    Methods to add a new student
    @PostMapping
    public String save(@RequestBody Student student){
        return studentService.save(student);
    }

//    Methods to Search for student by name (first name)

    @GetMapping
    public List<Student> getStudentName(@RequestParam("name")String name){
        return studentService.getStudentName(name);
    }

    //    Getting Students by class
    @GetMapping("/class/{studentClass}")
    public List<Student> getStudentsByClass(@PathVariable("studentClass") String studentClass) {
        return studentService.getStudentsByClass(studentClass);
    }


    //    Displaying lis of students
    @GetMapping("/allStudent")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

//    Deleting a student
    @DeleteMapping("/{studentId}")
    public void deleteStudent(@PathVariable String studentId){
        studentService.deleteStudentById(studentId);
    }


//    Searching for student using id
    @GetMapping("/{studentId}")
    public Student getStudentById(@PathVariable String studentId){
        return studentService.getStudentById(studentId);
    }

//    Updating student details
    @PutMapping("/{studentId}")
    public void updateStudent(@PathVariable String studentId, @RequestBody Student updatedStudent) {
        studentService.updateStudent(studentId, updatedStudent);
    }

}
