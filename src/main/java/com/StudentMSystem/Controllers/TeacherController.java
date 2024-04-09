package com.StudentMSystem.Controllers;

import com.StudentMSystem.Models.Teacher;
import com.StudentMSystem.Repository.TeachersRepository;
import com.StudentMSystem.Services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;
    private TeachersRepository teachersRepository;


//    Login Route


    @PostMapping("/login")
    public ResponseEntity<Teacher> loginTeacher(@RequestBody Teacher teacher) {
        Teacher foundTeacher = teacherService.getTeacherByEmailAndPassword(teacher.getEmail(), teacher.getPassword());

        if (foundTeacher != null) {
            return ResponseEntity.ok(foundTeacher);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
        }
    }

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

//
//
//

//    @PostMapping("/register")
//    public ResponseEntity<?> registerTeacher(@RequestBody Teacher teacher) {
//        // Check if email is already registered
//
//
//        if (teachersRepository.findByEmail(teacher.getEmail()) != null) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
//                    .body("Email already exists");
//        }
//        // Hash the password before saving
//        teacher.getUser().setPassword(bCryptPasswordEncoder.encode(teacher.getUser().getPassword()));
//
//        // Save the Teacher entity
//        teachersRepository.save(teacher);
//
//        return ResponseEntity.ok("Teacher registered successfully");
//    }


//    @PostMapping("/register")
//    public ResponseEntity<String> registerTeacher(@RequestBody Teacher teacher) {
//        // Validate the incoming teacher object and its associated user
//        if (teacher == null || teacher.getUsers() == null || teacher.getUsers().size() != 1) {
//            return ResponseEntity.badRequest().body("Invalid teacher data");
//        }
//
//        // Check if the email is already registered
//        if (teachersRepository.findByEmail(teacher.getEmail()) != null) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
//                    .body("Email already exists");
//        }

        // Hash the password before saving
//        BcryptPasswordEncoder bCryptPasswordEncoder;
//        teacher.getUsers().get(0).setPassword(bCryptPasswordEncoder.encode(teacher.getUsers().get(0).getPassword()));

        // Save the Teacher entity
//        teachersRepository.save(teacher);
//
//        return ResponseEntity.ok("Teacher registered successfully");
//    }



}
