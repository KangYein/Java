class Circle3{
	private int radius;
	public Circle3(int radius) {
		this.radius =radius;
	}
	public int getRadius() {
		return radius;
	}
}
//Circle Ŭ���� ��ӹ޾� NamedCircle Ŭ������ ����� ���� main()����� ���� ����� ��µǰ� �ڵ� �ۼ�
public class NamedCircle extends Circle3 {
	private String name;	
//super �� this ���
	NamedCircle(int ra,String name) {
		super(ra);
		this.name =name;
		
	}
	public void show() {
		System.out.println(name+",������="+getRadius());
	}
	public static void main(String[] args) {
//NamedCircle(int r,String n) ������ �ۼ�
		NamedCircle w = new NamedCircle(5,"Waffle");
//NamedCircle�� show()�� �ۼ�
	w.show();

	}
}
