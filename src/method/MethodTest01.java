package method;

class Super{
	
	void print() {
		
		System.out.println("Super의 print 메서드 입니다");
	}
}

class Sub01 extends Super{
	
	void display() {
		
		System.out.println("Sub의 display메서드 입니다");
	}
}

public class MethodTest01 {

	public static void main(String[] args) {
		
		Sub01 sub =new Sub01();
		sub.display(); //서브의 메서드
		sub.print(); //상속받은 메서드
	

	}

}
