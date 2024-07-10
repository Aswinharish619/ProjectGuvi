package JavaPackage;

public class StringDemo1 {
	
	public static void main(String[] args) {
		
		String sc1="Computer";
		String sc2="     AutomationTesting";
		String sc3="WELCOME";
		String sc4="java pogramming";
		
		int length =sc1.length();
		String Str1 =sc2.toLowerCase();
		String Str2 =sc4.toUpperCase();
		String Str3=sc2.trim();
		String Str4=sc4.substring(0, 9);
		String Str5=sc4.substring(4);
		CharSequence Str6=sc4.subSequence(0, 9);
		String Str7=sc2.replace('a', '$');
		char Str8=sc3.charAt(4);
		int Str9=sc4.indexOf("pro");
		int Str10=sc2.lastIndexOf("ion");
		
		System.out.println(length);
		System.out.println(Str1);
		System.out.println(Str2);
		System.out.println(Str3);
		System.out.println(Str4);
		System.out.println(Str5);
		System.out.println(Str6);
		System.out.println(Str7);
		System.out.println(Str8);
		System.out.println(Str9);
		System.out.println(Str10);
			
		
		
		
		
	}

}
