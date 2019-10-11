package com.employee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;

@RequestMapping("/api/employee")
@RestController
@CrossOrigin
public class EmployeeController {
	
	List<Employee> emplList = new ArrayList<>();
	
	@GetMapping("/all")
	public List<com.employee.model.Employee> getAll() {
		return emplList;
	}		
	
	@PostMapping("/add")
	  Employee newEmployee(@RequestBody Employee newEmployee) {
		newEmployee.setId(getRandomIntegerBetweenRange(1,100)); 
		System.out.println(newEmployee);
		emplList.add(newEmployee);
	    return newEmployee;
	  }
	
	
	public static int getRandomIntegerBetweenRange(int min, int max){
	    int x = (int)(Math.random()*((max-min)+1))+min;
	    return x;
	}

}
