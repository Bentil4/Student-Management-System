package com.StudentMSystem.Services;

import com.StudentMSystem.Models.Teacher;

import java.util.List;

public interface TeacherService {

//    Update teacher details
    void updateTeacher(String teacherID, Teacher updatedTeacher);

    String teachersData(Teacher teacher);

//    Get all teachers
    List<Teacher> getAllTeachers();

//    Get teacher by ID
    Teacher getTeacherById(String teacherID);

    void deleteTeacherByID(String teacherID);
//
//    List<Teacher> getTeacherName(String name);
}
