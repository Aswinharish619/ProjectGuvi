package multipleInheritance;

class Dog implements Animal1, Pet {
	 @Override
	 public void eat() {
	     System.out.println("Dog eats bones.");
	 }

	@Override
	public void play() {
		
		
		System.out.println("Pets love petting");
		
	}
	
}
