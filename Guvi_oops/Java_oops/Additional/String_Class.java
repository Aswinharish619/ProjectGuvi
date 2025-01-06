package Additional;

import java.util.Arrays;

public class String_Class {

	public static void main(String[] args) {
		
	String	str1 =" Hello World ";
	System.out.println(str1.length());
	
	String str2= "Happy";
	String str3= "New";
	String str4= "Year";
	System.out.println(str2+str3+str4);
	
	String str5="Selenium";
	String str6=str5.replace('e', 'i');
	System.out.println(str6);
	
	String str7="$20,15,10";
	String str8[]=str7.split(",");
	System.out.println(Arrays.toString(str8));
	String str9=(str8[0]+str8[1]+str8[2]);
	String str10=str9.replace('$', ' ');
	System.out.println(str10.trim());
	
	String str11="test,2468@demo";
	String str12=str11.replaceAll("[^a-zA-Z0-9]+", " ");
	System.out.println(str12);
	
	String st11= "test 2468";
	String st22[]=st11.split(",");
	System.out.println(Arrays.toString(st22));
	
	String st32= "Simon Sebasteian";
	System.out.println(st32.toLowerCase().contains("Simon"));
	

	}

}
