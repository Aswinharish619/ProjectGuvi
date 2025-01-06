package CollectionFrameWork;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hsm = new HashMap();
		
		hsm.put(1,"Nitharshana");
		hsm.put(2,"Gopu");
		hsm.put(3,"Shijo");
		hsm.put(null,null);
		//before
		System.out.println(hsm);
		hsm.remove(2, "Gopu");
		//after
		System.out.println(hsm);
		
		

	}

}
