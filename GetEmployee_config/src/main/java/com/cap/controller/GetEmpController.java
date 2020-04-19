package com.cap.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.cap.service.GetEmpService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
@RequestMapping("/emp")
@CrossOrigin("http://localhost:4200")
		public class GetEmpController  {
	@Autowired
	  GetEmpService empService;
	      @GetMapping("/find/{id}")
	      public Object findEmployee(@PathVariable Integer id) {
	    	  return empService.findEmployee(id);
	      }
			
			
}
