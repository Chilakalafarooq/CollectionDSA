package p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class List {
public static void main(String[] args) {
	
	Collection<Integer> evennumber =new ArrayList<Integer>() ;
	evennumber.add(100);
	evennumber.add(200);
	evennumber.add(300);
	evennumber.add(400);
	evennumber.add(500);
	evennumber.add(600);
	evennumber.add(700);
	
	System.out.println(evennumber);//[100, 200, 300, 400, 500, 600, 700]
	System.out.println(evennumber.size());//7
System.out.println(evennumber.containsAll(evennumber));//true
	
//	evennumber.clear();
//	System.out.println(evennumber);//[]
	
//evennumber.removeAll(evennumber);
//System.out.println(evennumber);//[]
	
	//System.out.println(Collections.EMPTY_LIST);//[]
	
	System.out.println(evennumber.isEmpty());
	
	
	Collection<Integer> oddnumber =new ArrayList<Integer>() ;
	oddnumber.add(3000);
	oddnumber.add(7000);
	oddnumber.add(5000);
	oddnumber.add(1000);
	oddnumber.addAll(evennumber);
	System.out.println(oddnumber);
	
	String str []= {"Banana","Apple","Grapes"};
	for (String string : str) {
		System.out.println(string);
	
	}
	ArrayList list = new ArrayList(Arrays.asList(str));
	System.out.println(list);
}
}
