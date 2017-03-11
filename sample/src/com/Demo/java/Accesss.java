package com.Demo.java;

public class Accesss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sport1 ss=new Sport1();
		ss.method1();
		System.out.println("**********");
		ss.method2();

	}

}
class Sport
{
	
	public int b=44;
	protected String c="Trushali";
	int a=10;
	private int id=55;
	
	public void method1()
	{
		System.out.println(b);
		System.out.println(c);
		System.out.println(a);
		System.out.println(id);
	}
	
}
class Sport1 extends Sport
{
	protected void method2()
	{
		System.out.println(b);
		System.out.println(c);
		System.out.println(a);
		//System.out.println(id);
		
	}
}
class Sport2 
{
	public void method2()
	{
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(a);
		//System.out.println(id);
		
	}
}
