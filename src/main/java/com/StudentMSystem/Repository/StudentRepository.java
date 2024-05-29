package com.StudentMSystem.Repository;

import com.StudentMSystem.Models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

    List<Student> findByFirstName(String name);

    List<Student> findByStudentClass(String studentClass);
}
