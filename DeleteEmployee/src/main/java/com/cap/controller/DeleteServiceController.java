package com.cap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cap.entities.Employee;
import com.cap.service.DeleteEmpService;

@RestController
@RequestMapping("/emp")
@CrossOrigin("http://localhost:4200")
public class DeleteServiceController {
@Autowired
private DeleteEmpService empService;
@Autowired
RestTemplate rest;

@DeleteMapping("/deleteEmp/{id}")
public String updateEmp(@PathVariable Integer id) {
	Employee e=rest.getForObject("http://localhost:2223/emp/find/"+id,Employee.class);
	if(e!=null)
	{
		empService.deleteEmployee(id);
		return "employee deleted";	
	}
	else {
	return "emp does not exist";
}
}
}