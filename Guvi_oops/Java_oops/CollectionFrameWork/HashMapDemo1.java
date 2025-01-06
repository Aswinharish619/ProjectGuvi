package CollectionFrameWork;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo1 {

		public static void main(String[] args) {
			
			HashMap<Integer,String> hsm1 = new HashMap();
			
			hsm1.put(120,"india");
			hsm1.put(150,"china");
			hsm1.put(40,"US");
			hsm1.put(null,"Nepal");
			
			System.out.println(hsm1);
			hsm1.remove(150, "china");
			hsm1.remove(40, "US");
			
			System.out.println(hsm1.get(120));
			System.out.println(hsm1.get("Nepal"));
			
			Scanner sc1= new Scanner(System.in);
			System.out.println("Enter the country name");
			

	}

}
