package com.springboot_student_subject_application.repository;

import com.springboot_student_subject_application.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
