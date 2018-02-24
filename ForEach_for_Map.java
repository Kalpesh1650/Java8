package com.java.java8.LamdaExpressions;

import java.util.LinkedHashMap;
import java.util.Map;

public class ForEach_for_Map {

	public static void main(String[] args) {
		
		Map<Object,Object> map = new LinkedHashMap<Object,Object>();
		
		map.put("1","One");
		map.put("2","Two");
		map.put("3","Three");
		map.put("4","Four");
		map.put("5","Five");

		//map.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));

		map.forEach((k,v)->{
			System.out.println("Key : " + k + " Value : " + v);
			if("3".equals(k)){
				System.out.println("Its Three!!!");
			}
		});
	}
}
