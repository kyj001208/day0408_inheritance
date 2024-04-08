package method;

class Super03 {
	void display() {

		System.out.println("!!Super03의 display()메서드 입니다!!");
	}

}

class Sub03 extends Super03 {

	void display() {

		System.out.println("**Sub03의 display()메서드 입니다**");
	}

}

public class MethodTest03 {

	public static void main(String[] args) {

		// 부모클래스로 변수(객체변수) 선언하고 자식클래스로 객체생성(인스턴스화) 달성
		Super03 super03 = new Sub03();
		super03.display(); //자식객체의 재정의(오버라이드)된 메서드가 실행
		
		
	}

}