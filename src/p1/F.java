package p1;

import java.util.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
public class F {
public static void main(String[] args) {
	HashSet<String> set  = new HashSet<String>();
	//set.add(null);
	set.add("mango");
	set.add("Apple");
	set.add("Grapes");
	set.add("Pineapple");
	set.add("Dragon Fruit");
	set.add("Banana");
	set.add("mango");
	set.add("mango");
	
	
	long count = set.stream().filter(a-> a.contains("p")).count();
	System.out.println("Count the letters.."+count);//Count the letters..3
	
	System.out.println(set);//[null, Apple, Grapes, Dragon Fruit, Pineapple, mango, Banana]
	
 set.removeIf(z-> z.startsWith("A"));
	System.out.println(set);//[Grapes, Dragon Fruit, Pineapple, mango, Banana]
	
	
	boolean removeIf = set.removeIf(z-> z.startsWith("m"));
	System.out.println(removeIf);//true
	
	
	
	//This method help us to read the data
	String [] arr = new String[5];
	arr=set.toArray(arr);
	for (String string : arr) {
		System.out.println(string);
		
	}
//	null
//	Apple
//	Grapes
//	Dragon Fruit
//	Pineapple
//	mango
//	Banana
	System.out.println();
	//This is one method to read data in hashset by using java 8 features
	set.stream().forEach(x->System.out.println(x));
//	null
//	Apple
//	Grapes
//	Dragon Fruit
//	Pineapple
//	mango
//	Banana

	
	//This is the another method to read the data in collection
for (String string : set) {
	System.out.println(string);
//	null
//	Apple
//	Grapes
//	Dragon Fruit
//	Pineapple
//	mango
//	Banana
	
	
	//This is the another method to read the data in collection
	Iterator<String> itr = set.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
//		null
//		Apple
//		Grapes
//		Dragon Fruit
//		Pineapple
//		mango
//		Banana
	}
	
	//This method help us remove null values
		Set<String> collect = set.stream().
								filter($-> $!=null).
									collect(Collectors.toSet());
		System.out.println(collect);//[Apple, Grapes, Dragon Fruit, Pineapple, mango, Banana]
}
}
}
