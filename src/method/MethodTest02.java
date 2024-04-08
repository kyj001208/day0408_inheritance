package method;

class Super02 {
	void display() {

		System.out.println("!!Super02의 display()메서드 입니다!!");
	}

}

class Sub02 extends Super02 {

	void display() {

		System.out.println("**Sub02의 display()메서드 입니다**");
	}

	void print() {
		
		super.display(); //부모의 정의된 메서드 실행시 super. 메서드명
	}

}

public class MethodTest02 {

	public static void main(String[] args) {
		
		Sub02 sub=new Sub02();
		sub.display();//자식 클래스에 정의된 메서드 실행void display() {
		
		System.out.println("Super02의 display()메서드 입니다");
	}
	

}