package com.bk.Ecommerce.repository;

import com.bk.Ecommerce.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
