package com.StudentMSystem.Services;

import com.StudentMSystem.Models.Student;
import java.util.List;

public interface StudentService {
    String save(Student student);

    List<Student> getStudentName(String name);

    //    Getting all students
    List<Student> getAllStudent();

//    Deleting student using the Id

    void deleteStudentById(String studentId);

    //    Searching for student using id
    Student getStudentById(String studentId);

    void updateStudent(String studentId, Student updatedStudent);
}


