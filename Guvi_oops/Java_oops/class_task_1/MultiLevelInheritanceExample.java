package class_task_1;

//Grandparent class
class Animal {
 void eat() {
     System.out.println("This animal eats food.");
 }
}

//Parent class
class Mammal extends Animal {
 void walk() {
     System.out.println("This mammal walks.");
 }
}

//Child class
class Dog2 extends Mammal {
 void bark() {
     System.out.println("The dog barks.");
 }

public void play() {
	// TODO Auto-generated method stub
	
}
}

public class MultiLevelInheritanceExample {
 public static void main(String[] args) {
     Dog2 dog = new Dog2();
     
          dog.eat();   // Method from Animal class
     dog.walk();  // Method from Mammal class
     dog.bark();  // Method from Dog class
 }
}
