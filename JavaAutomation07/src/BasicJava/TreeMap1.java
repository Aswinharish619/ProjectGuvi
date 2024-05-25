package BasicJava;

import java.util.TreeMap;

public class TreeMap1 {
	
	public static void main(String[] args) {
		
		TreeMap<Integer,String> tm =new TreeMap<>();
		
		tm.put(1,"Harish1");
		tm.put(2,"Harish2");
		tm.put(3,"Harish3");
		tm.put(7,"Harish4");
		
		TreeMap<Character,String> tm1= new TreeMap<>();
		
		tm1.put('a',"Harish1");
		tm1.put('b',"Harish2");
		tm1.put('c',"Harish3");
		tm1.put('d',"Harish4");
		System.out.println(tm1);
		tm1.clear();
		System.out.println(tm1);
		
		System.out.println(tm.ceilingEntry(5));
		System.out.println(tm.floorEntry(4));
		System.out.println(tm.get(2));
		
	}

}
