package com.sptpc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sptpc.domain.College;
import com.sptpc.persistence.CollegeMapper;

@Service
public class CollegeService {
	@Autowired
	private CollegeMapper collegeMapper;
	public List<College> getAllCollege(){
		
		return collegeMapper.findAllCollege();
		
	}
	
}
