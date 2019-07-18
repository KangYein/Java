public class Car {
	String color;
	int speed;
	
	void upSpeed(int value) {
		speed = speed + value;
	}
	void downSpeed(int value) {
		speed = speed - value;
	}
	String getColor() {
		return color;
	}
	int getSpeed() {
		return speed;
	}

	public static void main(String[] args) {
		Car myCar1=new Car();//myCar1 인스턴스를 생성하고 색상과 속도를 지정한다. 모든 속도는 초기에 0으로 설정한다.
		myCar1.color = "빨강";
		myCar1.speed=0;
		
		Car myCar2=new Car();
		myCar2.color = "파랑";
		myCar2.speed=0;
		
		Car myCar3=new Car();
		myCar3.color = "노랑";
		myCar3.speed=0;
		
		myCar1.upSpeed(30);
		myCar2.upSpeed(80);
		myCar2.downSpeed(30);
		myCar3.upSpeed(20);
		
		System.out.println("자동차 1의 색상은 "+myCar1.color+"이며 현재 속도는"+myCar1.speed+"km입니다");
		System.out.println("자동차 1의 색상은 "+myCar1.getColor()+"이며 현재 속도는"+myCar1.getSpeed()+"km입니다");
		System.out.println("자동차 1의 색상은 "+myCar2.color+"이며 현재 속도는"+myCar2.speed+"km입니다");
		System.out.println("자동차 1의 색상은 "+myCar3.color+"이며 현재 속도는"+myCar3.speed+"km입니다");
	}
}
