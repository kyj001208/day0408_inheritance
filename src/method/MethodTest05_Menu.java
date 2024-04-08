package method;

import java.util.Random;

class Menu{
	
	void serve() {
		System.out.println("짜장면 , 짬뽕, 볶음밥, 마파두부, 탕수육, 유산슬을 제공합니다.");
	
	}
}
class MonMenu extends Menu{
	
	void serve() {System.out.println("오늘의 메뉴: 짜장면");}}
	
class TueMenu extends Menu{
	
	void serve() {System.out.println("오늘의 메뉴: 짬뽕");}}

class WedMenu extends Menu{
	
	void serve() {System.out.println("오늘의 메뉴: 볶음밥");}}

class ThuMenu extends Menu{
	
	void serve() {System.out.println("오늘의 메뉴: 마파두부");}}

class FriMenu extends Menu{
	
	void serve() {System.out.println("오늘의 메뉴: 탕수육");}}

class SatMenu extends Menu{
	
	void serve() {System.out.println("오늘의 메뉴: 유산슬");}}


//메서드 오버라이드를 통해서 실행 시 내용을 다르게 구현된다.
//오버라이드된 내용이 실행됩니다.
//결국은 현재 코드의 경우 부모메서드 내용은 그닥 쓸모가 없다.
public class MethodTest05_Menu {

	public static void main(String[] args) {
		
		Menu menu=null;
		
		Random r=new Random();
		int dayOfweek=r.nextInt(6)+1;
		switch(dayOfweek){
			
		case 1: menu=new MonMenu(); break;
		case 2: menu=new TueMenu(); break;
		case 3: menu=new WedMenu(); break;
		case 4: menu=new ThuMenu(); break;
		case 5: menu=new FriMenu(); break;
		case 6: menu=new SatMenu(); break;
		
		default:System.out.print("오늘은 휴일입니다");
			
			
		}
		
		if(menu!=null) {
			
			menu.serve();
		}

	}

}
