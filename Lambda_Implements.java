package com.java.java8.LamdaExpressions;

@FunctionalInterface  
interface I_Face{
	void method1();
}

interface I_Addition{
	int add(int a, int b);
	
}
 
interface I_Compare{
	boolean compare(int a, int b);
	
}
 
public class Lambda_Implements {
	
	int x=100;
	public void method2() {
		int y=200;
		
		I_Face i = () -> {
			System.out.println("X = "+x);
			System.out.println("Y = "+y);
			
		};
			
		i.method1();
	}
	public void do_Comparision() {
		
		 I_Compare compare = (a,b) -> {
			 
			 return a > b;
		 		}; 	
		int X=100,Y=300;
		if(compare.compare(X, Y)){
			System.out.println("Greater Number = "+X);
		}else {
			System.out.println("Greater Number = "+Y);
		}
	}
	public void do_Addition() {
		
		 I_Addition i_add = (a,b) -> {
			 return a+b;
			 };
			
		System.out.println("Addition of 100 & 300 is = "+i_add.add(100, 300));
	}
	public static void main(String[] args) {
		
	Lambda_Implements test = new Lambda_Implements();
	//test.method2();
	//test.do_Addition();
	test.do_Comparision();
	
	}
}

