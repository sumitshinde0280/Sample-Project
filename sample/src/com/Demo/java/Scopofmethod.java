package com.Demo.java;

public class Scopofmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scopofmethod.staticMethod();
	}
	
	static void  staticMethod()
	{
		Scopofmethod s = new Scopofmethod();
		s.instanceMethod2();	
	}

	void  instanceMethod1()
	{
	}
	
	 void  instanceMethod2()
	{
		
	}
} 
