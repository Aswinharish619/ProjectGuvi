package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList myList = new ArrayList();
		
		myList.add(200);
		myList.add("Chennai");
		myList.add(90.99);
		myList.add('G');
		myList.add(null);
		myList.add(200);
		myList.add(null);
		myList.add(false);
		myList.add(true);
		
		//Size of array List
		System.out.println("My List Size --> "+ myList.size());
		//printing Data of array List
		System.out.println("Printing my list -->" +myList);
		
		//Remove data from List 
		System.out.println(myList.remove(2));
		System.out.println("Printing my list -->" +myList);
		
		//Adding Data into the List
		myList.add(1,"Tony");
		System.out.println("Printing my list -->" +myList);
		
		//Modifying List
		myList.set(0, 880);
		System.out.println("Printing my list -->" +myList);
		
		//Access Specific Element
		System.out.println(	myList.get(7));

		//Reading all from Array List
	/*	for (int i=0; i <myList.size(); i++)
		{
			System.out.println(myList.get(i));
		}
		
		System.out.println("Printing my list -->" +myList);
		
		//for each Loop
		for (Object obj: myList) {
			System.out.println(obj);
		}
		*/
		
		//By Using Iterator
		Iterator it= myList.iterator();
		

	}

}
