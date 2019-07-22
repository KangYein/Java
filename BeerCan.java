/**
 추상 클래스-2개의 추상 메서드를 포함한 추상 클래스의 예
 **/
abstract class EmptyCan{
	public abstract void printContent();//추상 메서드
	public abstract void printName();//추상 메서드
}//end
/**
 추상 클래스의 구현-EmptyCan을 상속받아 완전한 클래스 만들기
 **/
public class BeerCan extends EmptyCan{
	//EmptyCan의 printContent()구현
	public void printContent() {
		System.out.println("흑맥주");
	}
	//EmptyCan의 printName()구현
	public void printName() {
		System.out.println("맥주캔입니다.");
	}
	//새로운 멤버 메서드 추가
	public void sayHello() {
		System.out.println("안녕하세요 맥주캔입니다.");
	}
	public static void main(String[] args) {
		BeerCan b = new BeerCan();
		b.printContent();
		b.printName();
		b.sayHello();
	}//end of main
}//end of BeerCan class
