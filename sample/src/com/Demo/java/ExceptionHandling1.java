package com.Demo.java;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		ExceptionHandling1 ex = new ExceptionHandling1();
		System.out.println("inside main method");
		ex.m1("smdlmd", "saldl");
		System.out.println("**********");
		m2();
		System.out.println("**********");
		ex.m3();
		System.out.println("execution completed");

	}

	private void m3() {
		// TODO Auto-generated method stub
		System.out.println("inside main method3");
		System.out.println("execution completed3");
	}

	private static int m2() {
		// TODO Auto-generated method stub
		System.out.println("inside main method2");
		System.out.println("execution completed2");
		return 0;
	}

	private boolean m1(String username, String password) {
		// username=null;
		boolean returnValue = false;// local variable
		System.out.println("inside main method1");

		try {
			if (username.equals("admin") && password.equals("abc"))
				returnValue = true;
			else
				returnValue = false;
			if (username == null)
				throw new NullPointerException();
		}

		catch (NullPointerException e) {
			System.out.println("null pointer");
		} catch (Exception ee) {
			System.out.println("exception");
		}

		System.out.println("execution completed1");
		m3();
		return returnValue;

	}

}
