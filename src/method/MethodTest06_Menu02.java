package method;

import java.util.Random;

abstract class Menu02{
	
	abstract void serve();//메서드의 선언부 -바디가 없는 메서드: 미완성된 코드(추상메서드)

}
class MonMenu02 extends Menu02{
	
	void serve() {System.out.println("오늘의 메뉴: 짜장면");}}
	
class TueMenu02 extends Menu02{
	
	void serve() {System.out.println("오늘의 메뉴: 짬뽕");}}

class WedMenu02 extends Menu02{
	
	void serve() {System.out.println("오늘의 메뉴: 볶음밥");}}

class ThuMenu02 extends Menu02{
	
	void serve() {System.out.println("오늘의 메뉴: 마파두부");}}

class FriMenu02 extends Menu02{
	
	void serve() {System.out.println("오늘의 메뉴: 탕수육");}}

class SatMenu02 extends Menu02{
	
	void serve() {System.out.println("오늘의 메뉴: 유산슬");}}


//메서드 오버라이드를 통해서 실행 시 내용을 다르게 구현된다.
//오버라이드된 내용이 실행됩니다.
//결국은 현재 코드의 경우 부모메서드 내용은 그닥 쓸모가 없다.
public class MethodTest06_Menu02 {

	public static void main(String[] args) {
		
		Menu02 Menu02=null;
		
		Random r=new Random();
		int dayOfweek=r.nextInt(6)+1;
		switch(dayOfweek){
			
		case 1: Menu02=new MonMenu02(); break;
		case 2: Menu02=new TueMenu02(); break;
		case 3: Menu02=new WedMenu02(); break;
		case 4: Menu02=new ThuMenu02(); break;
		case 5: Menu02=new FriMenu02(); break;
		case 6: Menu02=new SatMenu02(); break;
		
		default:System.out.print("오늘은 휴일입니다");
			
			
		}
		
		if(Menu02!=null) {
			
			Menu02.serve();
		}

	}

}
