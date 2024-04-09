package com.StudentMSystem.Repository;

import com.StudentMSystem.Models.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeachersRepository extends MongoRepository<Teacher, String> {
    Teacher findByEmailAndPassword(String email, String password);


//    Teacher findByEmail(String );
}
