package CollectionFrameWork;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack <String> st = new Stack();
		//To insert
		st.push("Radha");
		st.push("Ram");
		st.push("Vikram");
		
		System.out.println(st);
		// remove
		st.pop();
		System.out.println(st);
	}

}
