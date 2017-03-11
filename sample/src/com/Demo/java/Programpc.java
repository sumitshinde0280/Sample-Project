package com.Demo.java;

public class Programpc {
	
	int id;
	String name;
	
	//parameters constructor
	public Programpc(int i,String n) {
		// TODO Auto-generated constructor stub
		id=i;
		name=n;
	}
	void run()
	{
		System.out.println(id+""+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programpc p=new Programpc(1,"trushali");
		Programpc p1=new Programpc(2, "mayank");
		p.run();
		p1.run();

	}

}
