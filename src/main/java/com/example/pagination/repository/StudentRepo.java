package com.example.pagination.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pagination.model.Student;

public interface  StudentRepo extends JpaRepository<Student,Integer> {

}
