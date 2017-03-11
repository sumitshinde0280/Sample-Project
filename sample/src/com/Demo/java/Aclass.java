package com.Demo.java;

abstract public class Aclass {
	int vara1=10;
	int vara2=20;
	public Aclass(int A,int a){
		//System.out.println("Aclass constructor");
		vara1=A;
		vara2=a;
	}
	
	abstract void method1();
	
	public void method2()
	{
		System.out.println("Inside method 2");
		System.out.println("A m2"+vara1);
	}
	public void method3()
	{
		System.out.println("Inside method 3");
	}

}
class Bclass extends Aclass
{

	 int varb1=99;
	int varb2;
	public Bclass(int B,int b){
		super(B, b);
		varb1=B;
		varb2=b;
		
		//System.out.println("Bclass constructor");
	}
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Inside method A");
	}
	public void method2()
	{
		System.out.println("Inside METHOD2");
	}
	public void method4()
	{
		System.out.println("Inside method4");
		System.out.println(varb1);
	}
	
}

class Cclass extends Aclass
{
int varc1=100;
int varc2=200;

public Cclass(int C,int c){
	super(C,c);
	//System.out.println("Cclass constructor"+varc1);
	varc1=C;
	varc2=c;
}
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("inside method 1 in c class");
	}
public void method3()
	{
		System.out.println("Inside METHOD3");
	}
	public void method5()
	{
		System.out.println("inside method5");
		System.out.println(varc1);
	}
	
}

class Testclass
{
	public static void main(String [] args)
	{
		Aclass a=new Bclass(10,20); 
		
		a.method1();//inside method A
		a.method2();// inside  METHOD2
		a.method3();//inside method3 class Aclass
		System.out.println("$$$$$$$$$");
		Bclass b= new Bclass(30,40);
		b.method1();//Inside method a
		b.method2();//Inside METHOD 2
		b.method3();// Inside method3
		b.method4();// inside method4
		System.out.println("***----------");
		
		Aclass c=new Cclass(50,60);
		c.method1();//inside method A
		c.method2();//inside  method2 class Aclass
		c.method3();//inside METHOD3
		System.out.println("%%%%%%%%");
		
		Cclass cc=new Cclass(0, 0);
		 cc.method1();
		 cc.method2();
		 cc.method3();
		 cc.method5();
		 
		 System.out.println("&&&&&&&&&&&");
		 Aclass[] obja=new Aclass[5];
		 obja[0]=new Bclass(11,55);
		 obja[1]=new Bclass(0, 0);
		 obja[2]=new Cclass(0, 0);
		 obja[3]=new Cclass(0, 0);
		 obja[4]=new Cclass(0, 0);
//		 
		 Bclass[] objb=new Bclass[5];
		 objb[0]=new Bclass(0,0);
		 objb[1]=new Bclass(0,0);
		 objb[2]=new Bclass(29, 10);
		 objb[3]=new Bclass(0,0);
		 objb[4]=new Bclass(0, 0);
//		 
//		 
		 Cclass[] objc=new Cclass[5];
		 objc[0]=new Cclass(0,0);
		 objc[1]=new Cclass(99,55);
		 objc[2]=new Cclass(11,11);
		 objc[3]=new Cclass(66,44);
		 objc[4]=new Cclass(88,44);
//		 System.out.println("************");
		 for(Aclass item:objb)
		 {
			 if(item instanceof Bclass)
			 {
				 
				 Bclass bb=(Bclass)item ;
				 System.out.println("@@@@@@@@@@@@@");
				 bb.method1();
				 bb.method2();
				 bb.method3();
				 bb.method4();
			
			 }
			 else if(item instanceof Cclass)
			 {
				 Cclass c1=(Cclass)item;
				 System.out.println("/////////////");
				 c1.method1();
				 c1.method2();
				 c1.method3();
				 c1.method5();
				
			 }
		 
	}
	}
}


