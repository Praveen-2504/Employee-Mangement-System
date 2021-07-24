package com.test.firstapp.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.firstapp.CalculatorExample;

@RestController
@RequestMapping("/calculate")
public class CalculatorController {
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public int addOperation(@RequestBody CalculatorExample addOpt) {
		int add = addOpt.getVal1() + addOpt.getVal2();
		return add;
		
	}
	@RequestMapping(value = "/sub", method = RequestMethod.POST)
	public int subOperation(@RequestBody CalculatorExample subOpt) {
		int sub = subOpt.getVal1() - subOpt.getVal2();
		return sub;
		
	}
	@RequestMapping(value = "/mul", method = RequestMethod.POST)
	public int mulOperation(@RequestBody CalculatorExample mulOpt) {
		int mul = mulOpt.getVal1() * mulOpt.getVal2();
		return mul;
		
	}
	@RequestMapping(value = "/div", method = RequestMethod.POST)
	public int divOperation(@RequestBody CalculatorExample divOpt) {
		int div = divOpt.getVal1() / divOpt.getVal2();
		return div;
	}
	@RequestMapping(value = "/division/{val1}/{val2}", method = RequestMethod.POST)
	public int divOperation1(@PathVariable int val1,@PathVariable int val2) {
	int div = val1 / val2; 
	return div; 
	}
    @RequestMapping(value = "/division", method = RequestMethod.POST) 
	public int divOperation2(@RequestParam int val1,@RequestParam int val2) { 
	int div = val1 / val2; 
	return div; 
	}
	
	 
}
