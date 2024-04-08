package inheritance;

class Animal{
	
	String name;
	public void eat() {
		
		System.out.println(name+"이 먹는다.");
	}
}

class Dog extends Animal{
	
	public void bark() {
		
	System.out.println(name+"가 멍멍~짖는다");
		
	}
	
}

public class InheritanceTest {
	
	public static void main(String[] args) {
		
		Dog dog=new Dog();
		
	}

}
