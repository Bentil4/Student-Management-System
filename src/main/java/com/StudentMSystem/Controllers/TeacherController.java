package com.StudentMSystem.Controllers;

import com.StudentMSystem.Models.Student;
import com.StudentMSystem.Models.Teacher;
import com.StudentMSystem.Services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping("/addteacher")
    public String teachersData(@RequestBody Teacher teacher){
        return teacherService.teachersData(teacher);
    }



//    Getting all teachers data
    @GetMapping("/getAllTeacher")
    public List <Teacher> getAllTeachers(){
        return teacherService.getAllTeachers();
    }

//  Get teacher by ID
    @GetMapping("/{teacherID}")
    public Teacher getTeacherById(@PathVariable String teacherID){
        return teacherService.getTeacherById(teacherID);
    }

// Update Teacher details
    @PutMapping("/{teacherID}")
    public void updateTeacher(@PathVariable String teacherID, @RequestBody Teacher updatedTeacher){
        teacherService.updateTeacher(teacherID, updatedTeacher);
    }

//    Delete a Teacher
    @DeleteMapping("/{teacherID}")
    public void deleteTeacher(@PathVariable String teacherID){
        teacherService.deleteTeacherByID(teacherID);
    }

}
