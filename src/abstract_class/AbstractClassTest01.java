package abstract_class;


abstract class Animal{
	
	abstract void sound();
}

//abstract 클래스를 상속받은 클래스도 abstract class
abstract class Cat01 extends Animal{}


class Cat02 extends Animal{

	@Override
	void sound() {
		System.out.println("일반적으로 추상클래스는 하위클래스에서 추상메서드를 구현 후 사용");
	}
	
	

}

public class AbstractClassTest01 {

	public static void main(String[] args) {
		
		//고양이는 동물이_is-a 관계
		Animal ani=new Cat02();
		ani.sound();
		
		Cat02 cat=(Cat02)ani; //동일 계열일때 캐스팅 가능
		
		long b=10;
		int a=(int)b; //long b가 크기에 int로 캐스팅
		
		double c=3.14f;
		float d=(float)c;
	
		a=(int)c;
		
	}
	

}
