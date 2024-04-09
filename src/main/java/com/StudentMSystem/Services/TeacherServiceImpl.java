package com.StudentMSystem.Services;

import com.StudentMSystem.Models.Teacher;
import com.StudentMSystem.Repository.TeachersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService{

    @Autowired
    private TeachersRepository teachersRepository;

    @Override
    public void updateTeacher(String teacherID, Teacher updatedTeacher) {
        Teacher existingTeacher = getTeacherById(teacherID);

        if (existingTeacher != null){
            existingTeacher.setFirstName(updatedTeacher.getFirstName());
            existingTeacher.setMiddleName(updatedTeacher.getMiddleName());
            existingTeacher.setLastName(updatedTeacher.getLastName());
            existingTeacher.setContact(updatedTeacher.getContact());
            existingTeacher.setEmail(updatedTeacher.getEmail());
            existingTeacher.setUserName(updatedTeacher.getUserName());
            existingTeacher.setPassword(updatedTeacher.getPassword());
            existingTeacher.setRole(updatedTeacher.getRole());
            existingTeacher.setTeachingSubjects(updatedTeacher.getTeachingSubjects());

            teachersRepository.save(existingTeacher);
        }
    }

    @Override
    public String teachersData(Teacher teacher) {
        return teachersRepository.save(teacher).getTeacherID();
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return teachersRepository.findAll();
    }

    @Override
    public Teacher getTeacherById(String teacherID) {
        return teachersRepository.findById(teacherID).orElse(null);
    }

    @Override
    public void deleteTeacherByID(String teacherID) {
        teachersRepository.deleteById(teacherID);
    }

    @Override
    public Teacher getTeacherByEmailAndPassword(String email, String password) {
        return teachersRepository.findByEmailAndPassword(email, password);
    }
}
