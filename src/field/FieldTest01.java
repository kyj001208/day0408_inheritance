package field;

class Super02{
	
	
}
class Super01{
	
	int a=10;
	int b=20;  
	
}

class Sub01 extends Super01{
	int a=500;
	double c=10.77;
	
	void display() {
		System.out.println(this.a); //현재 클래스의 a를 말함
		System.out.println(super.a);//상속받은 부모의 a를 말함
	}
	
}


public class FieldTest01 {
	
	public static void main(String[] args) {
		
		Sub01 sub1=new Sub01();
		System.out.println(sub1.a);//500
		sub1.display();
		System.out.println(sub1.b);//20
		System.out.println(sub1.c);//10.77
	
	}

}
