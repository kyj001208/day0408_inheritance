package method;

class Animal {

	void sound() {

		System.out.println("동물들은 소리를 냅니다.");
	}

}

//Animal 클래스를 상속받은 Dog 클래스
class Dog extends Animal {
	
	@Override //Dog 클래스에서 sound()메서드 오버라이드
	void sound() {

		System.out.println("강아지가 멍멍.");
	}

}
//Animal 클래스를 상속받은 Cat 클래스
class Cat extends Animal {
	
	void sound() {

		System.out.println("고양이가 야옹.");
	}


}

public class MethodTest04_animal {

	public static void main(String[] args) {
		
		/*
		//Animal 타입의 객체변수로 Dog객체를 참조
		Animal animalDog=new Dog();
		animalDog.sound();

		Animal animalCat=new Cat();
		animalCat.sound();
		같은 메서드를 호출하는데 실행하는 내용은 다릅니다.
		그럼 dog객체와 cat 객체가 공통 타입이 존재
		/*/
		
		Animal animal=null;
		animal =new Dog();
		animal.sound();
		animal=new Cat();
		animal.sound();
		//부모타입 하나로 다른내용이 실행되도록 구현할 수 있다.
		
	} 

}
