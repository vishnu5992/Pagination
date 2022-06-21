package com.example.pagination.service;

import java.util.List;


import com.example.pagination.model.Student;

public interface StudentService {
    
	List<Student> findPaginated(int pageNo,int pageSize);
}
