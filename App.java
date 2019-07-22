import java.util.Scanner;

abstract class Calculator{
	protected int a,b;
	protected void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 2���� �Է��ϼ���>>");
		a= sc.nextInt();
		b= sc.nextInt();
		}
	abstract public int calc();
	public void run() {
		input();
		int res =calc();
		System.out.println("���� ����:"+res);
	}
}
//�߻�޼ҵ� Caculator�� ��ӹ޾� Subtracter Ŭ���� �ۼ�
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