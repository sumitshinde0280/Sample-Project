package com.accessmodifers;

public class ParentClass {

	public int b = 44;
	protected String c = "Trushali";
	int a = 10;
	private int id = 55;

	public void m1() {
		System.out.println("PArent class method m1");
		System.out.println("value" + a);
		System.out.println("value" + b);
		System.out.println("value" + c);
		System.out.println("value" + id);
	}

	void m8() {
		System.out.println("inside method8...parentclass");

	}

	protected void m4() {
		System.out.println("PArent class method m4");
		System.out.println("value" + a);
		System.out.println("value" + b);
		System.out.println("value" + c);
		System.out.println("value" + id);
	}
}
