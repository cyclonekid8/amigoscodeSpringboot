package com.example.demo.repository;
import com.example.demo.entities.students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<students, Integer> {
    // SELECT * FROM students where name  = ?
    @Query("SELECT s FROM  students s WHERE s.name = ?1")
    Optional<students> findstudentsByName(String name);

    @Query("SELECT s FROM students s WHERE s.name = ?1 AND s.id = ?2")
    Optional<students>  findStudentByNameAndId(String name, int id);

    @Query("SELECT s FROM students s WHERE s.id = ?1")
    Optional<students> findStudentById(int id);
}
