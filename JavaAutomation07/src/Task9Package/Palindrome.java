package Task9Package;

public class Palindrome {

	public static boolean isPalindrome(String str) {
		return str.equals(new StringBuilder(str).reverse().toString());
	}

	public static void main(String[] args) {
		String str1 = "MALAYALAM";
		String str2 = "noon";
		String str3 = "words";

		System.out.println(str1 + " is a palindrome: " + isPalindrome(str1));
		System.out.println(str2 + " is a palindrome: " + isPalindrome(str2));
		System.out.println(str3 + " is a palindrome: " + isPalindrome(str3));
	}

}
