package BasicJava;

import java.util.Hashtable;

public class HashTable1 {
	
	public static void main(String[] args) {
		
		Hashtable<Integer,String> tab= new Hashtable<>();
		
		tab.put(1,"Simon1");
		tab.put(2,"Simon2");
		tab.put(3,"Simon3");
		tab.put(4,"Simon4");
		//tab.put(5,null);
		//tab.put(null,"Simon");
		
		System.out.println(tab);
		
	}

}
