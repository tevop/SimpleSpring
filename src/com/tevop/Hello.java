package com.tevop;

import org.springframework.stereotype.Component;

@Component("hello")
public class Hello {
	public void hi() {
		System.out.println("hello");
	}
}
