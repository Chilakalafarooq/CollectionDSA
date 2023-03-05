package p1;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class B {
public static void main(String[] args) {
	
	LinkedList< String> l = new LinkedList< String>();
	l.add("Dragon Fruit");
	l.add("Mango");
	l.add("Grapes");
	l.add("Banana");
	l.add("Apple");
	l.add("Guava");
	l.add("Pineapple");
	l.add("Apple");
	System.out.println(l);//[Dragon Fruit, Mango, Grapes, Banana, Apple, Guava, Pineapple, Apple]
	
	System.out.println(l.containsAll(l));//true
//	System.out.println(Collections.emptyList());//[]
	//System.out.println(Collections.emptyIterator());//java.util.Collections$EmptyIterator@1175e2db
	System.out.println(Collections.max(l));
	
	System.out.println(Collections.reverseOrder());
	System.out.println(Collections.min(l));
	
	for (String string : l) {
		System.out.println(string);
		
	}
	
	Iterator< String> itr= l.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
		
	}
	l.stream().forEach(l1->System.out.println(l1));
	}

}
