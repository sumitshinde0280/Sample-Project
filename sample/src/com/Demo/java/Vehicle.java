package com.Demo.java;

public abstract class Vehicle {
	void run() {
	}
	String []name={"A","B","C"};

}
class Toyota extends Vehicle
{
	String name="TOYOTA";
	int no=121212;
	void method1()
	{
		System.out.println(name+" "+ no);
	}
}
class Maruti extends Vehicle
{
	int id;
	Maruti(int i)
	{
		id=i;
	}
	
	public void method2()
	{
		System.out.println(id);
	}
	void method3()
	{
		System.out.println("Maruti id is "+ id);
	}
}

