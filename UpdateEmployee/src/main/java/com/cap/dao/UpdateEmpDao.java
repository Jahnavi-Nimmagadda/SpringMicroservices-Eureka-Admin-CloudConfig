package com.cap.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cap.entities.Employee;

public interface UpdateEmpDao extends JpaRepository<Employee, Integer>{

}
