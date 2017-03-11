package com.accessmodifers;

public class A {
	void m3(){
		System.out.println("inside m3....A");
	}
	public static void main(String[] args) {
		ParentClass ps= new ParentClass();
		ps.m1();
		System.out.println("******");
		
		ChildClass cc = new ChildClass();
		cc.m4();
		cc.m2();
		System.out.println("#########");
		A a=new A();
		a.m3();
		
	}
}
