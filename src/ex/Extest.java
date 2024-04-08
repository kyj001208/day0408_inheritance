package ex;

class Super{}
class SUb extends Super{}

public class Extest {
	
	public static void main(String[] args) {
		
		//Super su= new SUb();
		

		Super su=new SUb();
		SUb sub=(SUb) su; //컴파일 오류는 아니나 예외가 발생
		
		System.out.println("정상 종료");
		
		
		
	}

}
