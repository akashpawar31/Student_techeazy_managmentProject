package com.springboot_student_subject_application.repository;

import com.springboot_student_subject_application.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject,Long> {
}
