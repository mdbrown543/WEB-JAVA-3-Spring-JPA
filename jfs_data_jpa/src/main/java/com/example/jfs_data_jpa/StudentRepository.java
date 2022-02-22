package com.example.jfs_data_jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface StudentRepository extends JPARepository<Student, Long> {
    List<Student> findByName(String name);
}
