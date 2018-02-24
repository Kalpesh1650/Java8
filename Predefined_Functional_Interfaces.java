package com.java.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Predefined_Functional_Interfaces {
	
	public static void main(String[] args) {
		
		//Predicate<T> has test method in it
		Predicate<String> predicate = (name) -> {
			
			if(name.equals("Kalpesh"))
				return true;
			else
				return false;
			
		};
		System.out.println("Predicate Output = "+predicate.test("Kalpesh"));
		
		//Function<T,R> has apply method in it
		Function<Object,Object> function = (StringNumber) -> {
			
			switch((String)StringNumber) {
				case "One":
					return 1;
				case "Two":
					return 2;
				case "Three":
					return 3;
				case "Four":
					return 4;
				default:
					return 0;
			}
		};
		System.out.println("Function output = "+function.apply("One"));
		
		//Consumer<T> has accept method in it
		Consumer<Object> consumer = (name) -> {
			System.out.print("Consumer Output = ");
			System.out.println("Name is "+name);
		};
		consumer.accept("Hello");
		
		//Supplier<ReturnType> has get method in it
		Supplier<Object> supplier = () ->{
			
			String[] cities = {"Pune","Delhi","Mumbai","Sydney","London"};
			int randomNumber = (int)(Math.random()*4+1);
			System.out.println(randomNumber);
			return (String)cities[randomNumber];
		};
		System.out.println("Supplier Output = "+supplier.get());
		
	}

}
