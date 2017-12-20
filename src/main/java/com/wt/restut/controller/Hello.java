package com.wt.restut.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wt.restut.aop.security.AdminOnly;

@RestController
public class Hello {
	
	@RequestMapping(value="/hello",method = RequestMethod.GET)
	@AdminOnly
	public String say() {
		return "Hello RestUT";
	}
}
