package p1;

import java.util.Arrays;
import java.util.Vector;
import java.util.stream.Collectors;

public class Vectorlist {
public static void main(String[] args) {
	Vector<Integer > v= new Vector<Integer > ();
	v.add(10);
	v.add(20);
	v.add(30);
	v.add(40);
	v.add(null);
	v.add(60);
	v.add(null);
	v.add(80);
	v.add(90);
	
	System.out.println(v);//[10, 20, 30, 40, 50, 60, 70, 80, 90]
	System.out.println(v.size());
	System.out.println(v.clone());
	System.out.println(v.containsAll(v));//true
	
	v.stream().forEach(vector-> System.out.println(vector));
	
	  v.stream().filter(x-> x!=null).collect(Collectors.toList());
	
	

}
	
}
