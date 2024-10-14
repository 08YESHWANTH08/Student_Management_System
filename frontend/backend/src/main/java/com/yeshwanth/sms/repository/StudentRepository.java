package com.yeshwanth.sms.repository;

import com.yeshwanth.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
