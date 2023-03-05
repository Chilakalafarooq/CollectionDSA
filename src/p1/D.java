package p1;

import java.util.NoSuchElementException;
import java.util.Optional;

public class D {
public static void main(String[] args) {
	//String str = "farooq@gmail.com";
	String str = null;
	//empty()
//	Optional<Object> emptyopetional =Optional.empty();
//	System.out.println(emptyopetional);//Optional.empty
	
	//of()Returns an {@code Optional} describing the given value, if
    //* non-{@code null}, otherwise returns an empty {@code Optional}.
//	Optional<Object> of = Optional .of(str);
//	System.out.println(of);
	//Optional[farooq@gmail.com]
	
	
	//get()If a value is present, returns {@code true}, otherwise throw new NoSuchElementException("No value present");

//	Optional<Object> of1 = Optional .of(str);
//	System.out.println(of1.get());
//	
	//farooq@gmail.com
	
	
	//ofNullable() if the value is present written value (Optional[farooq@gmail.com]) OR if the value is not present i written (Optional.empty)
//		Optional<String> ofNullable = Optional.ofNullable(str);
//		System.out.println(ofNullable);
	//Optional[farooq@gmail.com](Single value container
	//Optional.empty
//		Optional<String> ofNullable1 = Optional.ofNullable(str);
//		System.out.println(ofNullable1.get());
	//farooq@gmail.com
	
	
	
	//isPresent()is boolean value .If a value is  not present, returns { true}, otherwise returns { false}
    
//			Optional<String> ofNullable1 = Optional.ofNullable(str);
//	
//			if (ofNullable1.isPresent()) {
//				System.out.println(ofNullable1.get());
//			}else {
//				System.out.println("Value is not present");
//					//Value is not present

	
	
	//orElse() it is String  if the value present return value or else written default value
//				Optional<String> ofNullable1 = Optional.ofNullable(str);
//				String orElse = ofNullable1.orElse("defaultvalue");
//				System.out.println(orElse);
		
	
	
	//orElseGet(Supplier<? extends String> supplier)/orElseGet(()->"others");			
//					Optional<String> ofNullable1 = Optional.ofNullable(str);
//
//					String orElseGet = ofNullable1.orElseGet(()->"others");
//					System.out.println(orElseGet);
	
	//orElseThrow(Supplier<? extends IllegalArgumentException> exceptionSupplier)
	//If a value is present, returns the value, otherwise throws an exceptionproduced by the exception supplying function
Optional<String> ofNullable1 = Optional.ofNullable(str);
String orElseThrow = ofNullable1.orElseThrow(()-> 
 							new IllegalArgumentException("farooq"));
System.out.println(orElseThrow);

			}
			
		}


