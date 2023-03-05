package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class A {
public static void main(String[] args) {
	ArrayList< String> array = new ArrayList< String>();
	//array.add(null);
	//array.add(null);
	array.add("tom");
	array.add("tom");
	array.add("Tony");
	array.add("Cat");
	array.add("Dog");
	//array.add(null);
	System.out.println(array);//[null, null, tom, mike, Tony, Cat, Dog, null]
	
//System.out.println(array.remove(0));
	Collections.sort(array);
	System.out.println(array);//[Cat, Dog, Tony, tom, tom]
	
	Collections.shuffle(array);
	System.out.println(array);//[tom, tom, Dog, Tony, Cat]
	
	//This method help us print in reversr order
	Collections.sort(array,Collections.reverseOrder());
	System.out.println(array);//[tom, tom, Tony, Dog, Cat]
	
	//This method help us to suffle in random order
	Collections.shuffle(array);
	System.out.println(array);//[Dog, tom, Cat, Tony, tom]
	
	//This method help us to remove duplicate elements in list oblects
	List<String> collect = array.
			stream().distinct().
				collect(Collectors.toList());
	System.out.println(collect);//[null, tom, Tony, Cat, Dog]
	
	
	//This method help us to read the data present in our array elements
	array.stream().forEach(arr -> System.out.println(arr));
//	null
//	null
//	tom
//	mike
//	Tony
//	Cat
//	Dog
//	null
	
	// This method help us to remove Null values present in out elements
	ArrayList< String> a=	
			(ArrayList<String>) array.stream().
				filter(y-> y!=null).
					collect(Collectors.toList());
	System.out.println(a);//[tom, mike, Tony, Cat, Dog]
	
	
}
}
