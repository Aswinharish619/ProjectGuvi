package BasicJava;

import java.util.Stack;

public class IntStack {
	public static void main(String[] args) {
		
		Stack<Integer> Numb= new Stack<>();
		
		Numb.push(40);
		Numb.push(30);
		Numb.push(20);
		Numb.push(10);
		
		System.out.println(Numb);
		Numb.pop();
		System.out.println(Numb);
	
	}

}
