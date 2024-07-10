package BasicJava;

import java.util.ArrayDeque;

public class FIFODemo {
	
	
	public static void main(String[] args) {
		
		ArrayDeque <String>Name =new ArrayDeque<>();
		
		Name.add("Sachin");
		Name.add("Ravi");
		Name.add("Kamal");
		Name.add("AnuPriya");
		
		System.out.println(Name);
		Name.remove();
		System.out.println(Name);	

	}

}
