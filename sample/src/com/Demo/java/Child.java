package com.Demo.java;

import com.accessmodifers.ChildClass;
import com.accessmodifers.ParentClass;

public class Child extends ChildClass{
	void m6()
	{
		System.out.println("inside m6 other pak child class");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child p=new Child();
		p.m6();
		p.m7();
	ChildClass cc=new Child();
	
	}

}
