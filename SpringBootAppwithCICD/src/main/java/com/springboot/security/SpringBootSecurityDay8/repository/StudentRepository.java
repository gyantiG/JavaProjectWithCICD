package com.springboot.security.SpringBootSecurityDay8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.security.SpringBootSecurityDay8.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
