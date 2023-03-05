package p1;

import java.awt.print.Printable;

interface Cab{
	public void Cab();
}

//class ola implements Cab{
//
//	@Override
//	public void Cab() {
//		System.out.println("Ola cab is booked");
//	}
//	
//}


public class J {
public static void main(String[] args) {
	//Cab cab=  () -> System.out.println("Ola cab is booked");
	//cab.Cab();
	
	Print(() -> System.out.println("Ola cab is booked"));
	}

private static void Print(Cab cab) {
	cab.Cab();
	
}
		
}

