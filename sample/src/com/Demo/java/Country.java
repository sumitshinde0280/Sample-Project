package com.Demo.java;

public class Country implements Italy,Japan {
	
	
	public void India(Object o)
	{
		System.out.println( "India1="+ o+" ");
	}
	public void India(Integer o)
	{
		System.out.println("India2="+ o +" ");
	}
	
	public void India(int o)
	{
		System.out.println( "India3="+ o+" ");
	}
	public void India(float o)
	{
		System.out.println("India4="+ o+"");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Country c=new Country();
		c.India(10);
		c.method1();
		
		

	}
	@Override
	public
	 void method1() {
		// TODO Auto-generated method stub
		System.out.println(Japan.a);
		
	}


}
interface Italy
{
 int a=10;
	void method1();
	
}
interface Japan
{
	int a=20;
	void method1();
	//void method2();
}
