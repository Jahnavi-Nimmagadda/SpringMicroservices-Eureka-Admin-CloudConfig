package com.cap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.entities.Employee;
import com.cap.service.AddEmpService;



@RestController
@RequestMapping("/Addemp")
@CrossOrigin("http://localhost:4200")
public class AddEmployeeController {
	@Autowired
  AddEmpService empService;
      @PostMapping("/CreateEmployee")
      public String createEmployee(@RequestBody Employee emp) {
    	  return empService.createEmployee(emp);
      }
    
}

