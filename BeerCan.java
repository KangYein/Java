/**
 �߻� Ŭ����-2���� �߻� �޼��带 ������ �߻� Ŭ������ ��
 **/
abstract class EmptyCan{
	public abstract void printContent();//�߻� �޼���
	public abstract void printName();//�߻� �޼���
}//end
/**
 �߻� Ŭ������ ����-EmptyCan�� ��ӹ޾� ������ Ŭ���� �����
 **/
public class BeerCan extends EmptyCan{
	//EmptyCan�� printContent()����
	public void printContent() {
		System.out.println("�����");
	}
	//EmptyCan�� printName()����
	public void printName() {
		System.out.println("����ĵ�Դϴ�.");
	}
	//���ο� ��� �޼��� �߰�
	public void sayHello() {
		System.out.println("�ȳ��ϼ��� ����ĵ�Դϴ�.");
	}
	public static void main(String[] args) {
		BeerCan b = new BeerCan();
		b.printContent();
		b.printName();
		b.sayHello();
	}//end of main
}//end of BeerCan class
