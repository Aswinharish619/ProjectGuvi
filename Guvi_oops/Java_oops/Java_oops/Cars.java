package Java_oops;

public class Cars {
	
	String Model;
	int year;
	double rate;
	String Colour;
	
	Cars()
	{
		System.out.println("Hello Defualt Constructor");
	}
	
	Cars(String a, int b, double c,String d){
		
		Model =a;
		year =b;
		rate =c;
		Colour =d;

		
		System.out.println(a +" "+b+" "+c+" "+d);
	}

	public static void main(String[] args) {
	
		Cars obj= new Cars();
		Cars obj1= new Cars("Honda",2023, 4500.55, "Yellow");
	}

}
