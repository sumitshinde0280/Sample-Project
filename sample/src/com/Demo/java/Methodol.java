package com.Demo.java;

public class Methodol {
	
	
	public void m1(int a,int b)
	{
		System.out.println(a +" " +b);
	}
	public void m1(int c)
	{
		System.out.println(c);
	}
	static void m1(String name)
	{
		System.out.println(name);
	}
	private void m1(Double h)
	{
		System.out.println(h);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodol method=new Methodol();
	
		method.m1(1);
		method.m1(1, 5);
		method.m1("trushali");
		method.m1(22.33);
		

	}

}
