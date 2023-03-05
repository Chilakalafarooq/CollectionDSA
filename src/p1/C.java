package p1;

import java.util.LinkedList;

public class C {
	public static void main(String[] args) {
		
	
	
	LinkedList<String> list = new LinkedList<String>();
	
	//list.add(null);
	list.add("Car");
	list.add("Car");

	list.add("foo");

	list.add("Car");

	list.add("Mango");

	list.add("King");
	list.add("aaaa");
	list.add("xyxx");
	
	System.out.println(list);//[null, Car, Car, foo, Car, Mango, King, aaaa, xyxx]

	long count = list .stream().filter(p-> p.contains("a")).count();
	System.out.println("Count how many letters are present in a.."+count);//Count how many letters are present in a..5

	list.stream().forEach(j-> System.out.println(j));
//	Car
//	Car
//	foo
//	Car
//	Mango
//	King
//	aaaa
//	xyxx
	
	for (String string : list) {
		System.out.println(string);
//		Car
//		Car
//		foo
//		Car
//		Mango
//		King
//		aaaa
//		xyxx
		
	}
}
}