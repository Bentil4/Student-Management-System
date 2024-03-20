package com.StudentMSystem.Models;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@Document(collection = "teacher")
public class Teacher {
    @Id
    private String teacherID;
    private String firstName;
    private String middleName;
    private String lastName;
    private String contact;
    private String email;
    private List<TeachingSubject> teachingSubjects;
    private List<User> users;
}
