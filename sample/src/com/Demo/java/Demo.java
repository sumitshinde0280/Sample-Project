package com.Demo.java;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
C c=new C(55);
	}

}
abstract class A
{
	A()
	{
		super();
		System.out.println("Inside A constructor");
	}
	// static block
	static{
		System.out.println("inside static a");
	}
	//instance block
 {
	 System.out.println("inside instance a");

	}
}
class B extends A
{
	int c=10;
	B(int c)
	{
	
		//super(c);
		System.out.println("Inside B constructor");
		System.out.println(c);
	}
	//static block
	static{
		System.out.println("inside static b");
	}
	//instance block
	 {
		 System.out.println("inside instance b");

		}
}
class C extends B
{
//	C c=new C(55);
	int f=44;
	C(int tt)
	{
		super(tt);
		//this.c;
		System.out.println(this.f);
		System.out.println(f);
		System.out.println(super.c);
		this.c=88;
		
		
		System.out.println("Inside C constructor");
		System.out.println(c);
	}
	static{
		System.out.println("inside static c");
	}
	// instance block
	 {
		 System.out.println("inside instance c");

		}
}
