package com.example.pagination.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.pagination.model.Student;
import com.example.pagination.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepo sr;

	@Override
	public List<Student> findPaginated(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
	   Pageable paging = PageRequest.of(pageNo, pageSize);
	   Page<Student> pagedResult = sr.findAll(paging);
	     return pagedResult.toList();
	}

}
