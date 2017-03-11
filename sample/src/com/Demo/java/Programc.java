package com.Demo.java;

public class Programc {
	// simple constructor
	Programc() {

		System.out.println("APPLE");
	}
// default Constructor
	int id;
	String name;
	

	void run()
	{
		System.out.println(id+ "" +name);
	}
	public static void main(String[] args) {

		Programc p = new Programc();
		p.run();

	}

}
