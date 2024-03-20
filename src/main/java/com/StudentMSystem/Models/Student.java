package com.StudentMSystem.Models;

import java.util.List;


import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder

@Document(collection = "student")
public class Student {
    @Id
    private String studentId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String studentClass;
    private String dob;
    private String email;
    private String phone;
    private List<Subject> subjects;
    private List<Address> addresses;
    private List<Guardian> guardian;



}
