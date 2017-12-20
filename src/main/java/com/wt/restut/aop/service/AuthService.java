package com.wt.restut.aop.service;

import org.springframework.stereotype.Service;

@Service
public class AuthService {
	public void checkAccess() {
		String user = null;
		if(!"admin".equals(user)) {
			throw new RuntimeException("Operation is not allowed.");
		}
	}
}
