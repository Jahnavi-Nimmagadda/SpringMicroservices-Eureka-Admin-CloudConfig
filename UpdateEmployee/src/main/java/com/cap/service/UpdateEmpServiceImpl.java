package com.cap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.dao.UpdateEmpDao;
import com.cap.entities.Employee;

@Service
public class UpdateEmpServiceImpl implements UpdateEmpService{
	@Autowired
	private UpdateEmpDao empDao;
	@Override
	public String updateEmployee(Employee emp) {
	empDao.save(emp);
	return "Employee data updated";
	
		
	}

}