package com.StudentMSystem.Services;

import com.StudentMSystem.Models.Teacher;

import java.util.List;

public interface TeacherService {

    // Update teacher details
    void updateTeacher(String teacherID, Teacher updatedTeacher);

    // Save new teacher data
    String teachersData(Teacher teacher);

    // Get all teachers
    List<Teacher> getAllTeachers();

    // Get teacher by ID
    Teacher getTeacherById(String teacherID);

    // Delete teacher by ID
    void deleteTeacherByID(String teacherID);

    // Get teacher by email and password for login
    Teacher getTeacherByEmailAndPassword(String email, String password);
}
