package ex;

class Tire {

	void run() {

		System.out.println("일반 타이어");
	}
}

class SnowTire extends Tire {

	void run() {

		System.out.println("스노우 타이어");
	}

}

public class TireTest {

	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire; //다형성객체

		snowTire.run(); // 스노우 타이어
		tire.run(); // 스노우 타이어

	}
}
