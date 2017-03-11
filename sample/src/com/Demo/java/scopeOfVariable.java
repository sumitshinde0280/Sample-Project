package com.Demo.java;
class scopeOfVariableParent
{
	int i=1111;
	static int staticVar = 999;
}

public class scopeOfVariable extends scopeOfVariableParent{
	int i=222;
	static int staticVar = 888;
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		scopeOfVariable sc = new scopeOfVariable();
		
		sc.m1();
//		System.out.println(staticVar);
//		System.out.println(sc.staticVar);
//		System.out.println(scopeOfVariable.staticVar);
	
//		System.out.println(i);
//		System.out.println(sc.i);
//		System.out.println(scopeOfVariable.i);
	}
	
	private void m1() {
		// TODO Auto-generated method stub
		int i=333;
		
		scopeOfVariable sc1 = new scopeOfVariable();
		super.i = 66;
		this.i=99;
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);

//		System.out.println(staticVar);
//		System.out.println(sc1.staticVar);
//		System.out.println(scopeOfVariable.staticVar);
	}

}
