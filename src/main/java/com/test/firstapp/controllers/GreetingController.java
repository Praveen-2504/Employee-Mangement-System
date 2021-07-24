package com.test.firstapp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.firstapp.Employee;

@RestController
@RequestMapping("/greet")
public class GreetingController {
	@RequestMapping(value = "/user/{user}", method = RequestMethod.GET)
	public String greetUsers(@PathVariable("user") String user) {
		return "Hi "+user+", How are you?";
		
	}
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String greetUser(@RequestParam String user1) {
		return "Hi "+user1+", How are you?";
		
	}
	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public List<Employee> getEmployeeDetails(@RequestBody List<Employee> empList)
	{
		List<Employee> updateEmployee = new ArrayList<>();
		
		for(Employee emp: empList) {
			emp.setMessage("Hi! "+emp.getEmpName());
			updateEmployee.add(emp);
		}
		return updateEmployee;
	}
		
}	
