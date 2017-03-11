package com.accessmodifers;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ChildClass extends ParentClass{
 protected String s="asbcd";
	void m2(){
		System.out.println("Child class method m2");

	}
	protected void m7()
	{
		System.out.println("inside m7....childclass ");
	}
	public static void main(String[] args) {
		ChildClass c = new ChildClass();
		c.m1();
		c.m2();
		c.m8();
		System.out.println(""+c.s);;
	}
}
