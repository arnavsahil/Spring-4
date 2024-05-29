package com.ts;

import org.springframework.beans.factory.annotation.Autowired;

public class Teacher {
	
	@Autowired
	Student s;
	
	@Autowired
	Batch b;
	
	public void tm() {
		System.out.println("We are tm method");
		s.st();
		b.bt();
	}
	
}
