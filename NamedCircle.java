class Circle3{
	private int radius;
	public Circle3(int radius) {
		this.radius =radius;
	}
	public int getRadius() {
		return radius;
	}
}
//Circle 클래스 상속받아 NamedCircle 클래스를 만들어 다음 main()실행시 다음 결과가 출력되게 코드 작성
public class NamedCircle extends Circle3 {
	private String name;	
//super 및 this 사용
	NamedCircle(int ra,String name) {
		super(ra);
		this.name =name;
		
	}
	public void show() {
		System.out.println(name+",반지름="+getRadius());
	}
	public static void main(String[] args) {
//NamedCircle(int r,String n) 생성자 작성
		NamedCircle w = new NamedCircle(5,"Waffle");
//NamedCircle에 show()를 작성
	w.show();

	}
}
