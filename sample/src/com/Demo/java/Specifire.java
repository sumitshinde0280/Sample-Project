package com.Demo.java;

public class Specifire {

	 void m1() {
		System.out.println("a1");
	}
	 

}

 class Test1 extends Specifire {
	void m2() {
		System.out.println("m2");
	}
	
	public static void main(String[] args) {
		Specifire s= new Specifire();
//		Specifire s = new Specifire();
//		s.m1();
		Test1 t = new Test1();
		t.m2();
	}

}

class Test2w {
	
	
}
