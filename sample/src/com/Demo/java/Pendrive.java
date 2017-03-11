package com.Demo.java;

public abstract class Pendrive {
	int id;
	abstract public void m1();
	public Pendrive(int s)
	{
		id=s;
	}
	
	
	public void m2(){
		System.out.println("Apple2");
	}
	
	public void m3(){
		System.out.println("Sony3");
	}

}
 
 class Pendrive2 extends Pendrive{
	
	 public Pendrive2(int s) {
		super(s);
		// TODO Auto-generated constructor stub
	}
	public void m2(){
		System.out.println("APPLE2");
	}
	public void m4()
	{
		System.out.println("sandisk");
	}
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("method1");
		
	}
	
}
