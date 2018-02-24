 package com.java.java8;

 interface I_Left{
		
		default void m1(){
			System.out.println("...Inside Left Default method...");
			int i=0;
		}
		default void d_m1(){
			System.out.println("...Inside Left Default method...");
		}
		static void m3() {
			System.out.println("...Inside Static method of I_Left...");
		}
		void m4();
		
	}
	interface I_Right{
		
		default void m1(){
			System.out.println("...Inside Right Default method...");
			int i=1;
		}
		
	}
	
 
 
public class Default_Methods implements I_Left,I_Right {

	public void m1() {
		//System.out.println("My Own Implementation....");
		I_Right.super.m1(); //To Access I_Left default method
		I_Left.m3();
	}
	
	public void m4() {
		System.out.println("Implementation of m4 method...");
	}
	
	public static void main(String[] args) {
			Default_Methods d = new Default_Methods();
			d.m1();
			d.m4();

	}

}
