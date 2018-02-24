package com.java.java8.LamdaExpressions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Lambda_ForEachLoop {

	public static void main(String[] args) {
		
/*		List<Object> city_names = new ArrayList<>();
		city_names.add("Pune");
		city_names.add("Moscow");
		city_names.add("Paris");
		city_names.add("Melbourne");
		
		city_names.forEach(
				(n)->System.out.println(n)
			); */
		
		Books book1 = new Books("Book1");
		Books book2 = new Books("Book2");
		Books book3 = new Books("Book3");
		Books book4 = new Books("Book4");
		
		List<Books> book_list = new ArrayList<Books>();
		
		book_list.add(book1);
		book_list.add(book2);
		book_list.add(book3);
		book_list.add(book4);
		
		book_list.forEach(
					(n) -> System.out.println("Book Names = "+n)
		);
	}

}

class Books implements Iterable<Books>{
	
	String book_Name = null;
	
	Books(String b_name){
		book_Name = b_name;
	}
	String getBookName() {
		return this.book_Name;
	}
	public String toString() {
		return this.book_Name;
	}
	
	public Iterator<Books> iterator(){
		
		 Iterator<Books> it = new Iterator<Books>() {

		private int currentIndex = 0;

         @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

		@Override
		public boolean hasNext() {
			return false;
		}

		@Override
		public Books next() {
			// TODO Auto-generated method stub
			return null;
		}
		 };		
		return it;
		
	}
}





