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
		Car myCar1=new Car();//myCar1 �ν��Ͻ��� �����ϰ� ����� �ӵ��� �����Ѵ�. ��� �ӵ��� �ʱ⿡ 0���� �����Ѵ�.
		myCar1.color = "����";
		myCar1.speed=0;
		
		Car myCar2=new Car();
		myCar2.color = "�Ķ�";
		myCar2.speed=0;
		
		Car myCar3=new Car();
		myCar3.color = "���";
		myCar3.speed=0;
		
		myCar1.upSpeed(30);
		myCar2.upSpeed(80);
		myCar2.downSpeed(30);
		myCar3.upSpeed(20);
		
		System.out.println("�ڵ��� 1�� ������ "+myCar1.color+"�̸� ���� �ӵ���"+myCar1.speed+"km�Դϴ�");
		System.out.println("�ڵ��� 1�� ������ "+myCar1.getColor()+"�̸� ���� �ӵ���"+myCar1.getSpeed()+"km�Դϴ�");
		System.out.println("�ڵ��� 1�� ������ "+myCar2.color+"�̸� ���� �ӵ���"+myCar2.speed+"km�Դϴ�");
		System.out.println("�ڵ��� 1�� ������ "+myCar3.color+"�̸� ���� �ӵ���"+myCar3.speed+"km�Դϴ�");
	}
}
