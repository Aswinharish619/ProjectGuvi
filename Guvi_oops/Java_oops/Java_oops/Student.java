package Java_oops;

public class Student {

	
	
	Student()
	{
		System.out.println("Hello Defualt Constructor");
	}
	
	Student(String a, int b){
		
		a="Sachin";
		b=37;
		
		System.out.println(a +" "+b);
	}

	public static void main(String[] args) {
		
		Student obj= new Student();
		Student obj1= new Student("Sachin", 37);

	}

}
