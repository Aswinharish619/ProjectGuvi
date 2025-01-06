package CollectionFrameWork;

import java.util.ArrayDeque;

public class Queue_demo {

	public static void main(String[] args) {

		ArrayDeque<String> ary= new ArrayDeque();
		
		ary.add("Naveen");
		ary.add("Ram");
		ary.add("Vyshnavi");
		
		System.out.println(ary);
		ary.remove();
		System.out.println(ary);
		
		

	}

}
