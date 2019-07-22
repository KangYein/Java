import java.util.Scanner;

abstract class Calculator{
	protected int a,b;
	protected void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 2개를 입력하세요>>");
		a= sc.nextInt();
		b= sc.nextInt();
		}
	abstract public int calc();
	public void run() {
		input();
		int res =calc();
		System.out.println("계산된 값은:"+res);
	}
}
//추상메소드 Caculator를 상속받아 Subtracter 클래스 작성
class Adder extends Calculator{
	public int calc() {
		return a+b;
	}
 }
class Subtracter extends Calculator{
	public int calc() {
		return a-b;
	}
}
 public class App{
	public static void main(String[] args) {
		Adder adder = new Adder();
		Subtracter sub = new Subtracter();
		adder.run();
		sub.run();

	}
}