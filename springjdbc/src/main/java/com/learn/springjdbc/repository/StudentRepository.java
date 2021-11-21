package com.learn.springjdbc.repository;

import com.learn.springjdbc.domain.Student;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {
    @Query("select * from student where last_name = :lName")
    List<Student> findByLastName(@Param("lName") String lastName);
}
