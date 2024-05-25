package BasicJava;

import java.util.*;

public class HashMap1 {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> map= new HashMap<>();
		
		map.put(80,"CNG");
		map.put(110,"Petrol");
		map.put(90,"Disel");
		map.put(105,null);
		map.put(null,"null");
		
		
		for (Map.Entry<Integer, String> e: map.entrySet()) {
			
			System.out.print(e.getValue()+" ");
			System.out.print(e.getKey()+" ");
			System.out.println("");
			//System.out.println(map.get(80));
		}
		
		
		/*int arr[]= {10,20,30,40,50};
		
		for (int i=0;i<4;i++)
		{
			System.out.print(arr[i]+" ");
		}
		*/
		
		/*

		System.out.println(map);
		System.out.println(map.get(103));
		
		if(map.containsKey(106)) {
			
			System.out.println("Available");
			
		}else {
			System.out.println("Not Available");
		}
		*/
		
	}

}
