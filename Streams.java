package com.java.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(0);
		numbers.add(5);
		numbers.add(10);
		numbers.add(15);
		numbers.add(20);
		numbers.add(25);
		numbers.add(30);
		System.out.println(numbers);
		
		List<Integer> even_numbers = numbers.stream().filter(number -> number%2 == 0).collect(Collectors.toList());
		System.out.println(even_numbers);
		
		List<Integer> each_number_double = numbers.stream().map(number->number*2).collect(Collectors.toList());
		System.out.println(each_number_double);

	}

}
