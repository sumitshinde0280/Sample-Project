package com.Demo.java;

import javax.naming.ldap.ExtendedRequest;

public class TV {
	String name;
	
	public TV()
	{
		System.out.println("***/");
	}

	public void method1() {
		System.out.println("method1");
	}

	void method2() {
		System.out.println("method2");
		
	}

}

class Sony extends TV{
	
	public void method1()
	{
		System.out.println("METHOD1");
	}
	
	public void method3(){
		System.out.println("method3");
	}
	
}
