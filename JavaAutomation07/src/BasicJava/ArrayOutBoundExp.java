package BasicJava;

public class ArrayOutBoundExp {

	public static void main(String[] args) {

		int[] number = { 1, 2, 3, 4, 5 };

		try {

			System.out.println(number[8]);
		} catch (Exception a) {

			a.printStackTrace();
		}

	}

}
