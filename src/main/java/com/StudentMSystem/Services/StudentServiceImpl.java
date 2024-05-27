package com.StudentMSystem.Services;

import com.StudentMSystem.Models.Student;
import com.StudentMSystem.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    //    Adding new student
    @Override
    public String save(Student student) {
        return studentRepository.save(student).getStudentId();
    }

    //    Getting student name
    @Override
    public List<Student> getStudentName(String name) {
        return studentRepository.findByFirstName(name);
    }


    //    Getting all students

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }


//    Delete student using the ID
    @Override
    public void deleteStudentById(String studentId) {
        studentRepository.deleteById(studentId);
    }

    @Override
    public Student getStudentById(String studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }

//    Updating student details
    @Override
    public void updateStudent(String studentId, Student updatedStudent) {
        Student existingStudent = getStudentById(studentId);

        if (existingStudent != null){
            existingStudent.setFirstName(updatedStudent.getFirstName());
            existingStudent.setMiddleName(updatedStudent.getMiddleName());
            existingStudent.setLastName(updatedStudent.getLastName());
            existingStudent.setStudentClass(updatedStudent.getStudentClass());
            existingStudent.setDob(updatedStudent.getDob());
            existingStudent.setEmail(updatedStudent.getEmail());
            existingStudent.setAddresses(updatedStudent.getAddresses());
            existingStudent.setPhone(updatedStudent.getPhone());
            existingStudent.setGuardian(updatedStudent.getGuardian());
            existingStudent.setSubjects(updatedStudent.getSubjects());

            studentRepository.save(existingStudent);
        }
    }

    //    Getting Student by class/form
    @Override
    public List<Student> getStudentsByClass(String studentClass) {
        return studentRepository.findByStudentClass(studentClass);
    }




//    public List<Student> getStudentsByClass(String studentClass) {
//        return studentRepository.findByStudentClass(studentClass);
//    }


//
//    public Student getStudentById(String studentId) {
//        return studentRepository.findById(studentId).orElse(null);

}
