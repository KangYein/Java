class Air{
	public void land() {
		System.out.println("착륙");
	}
	public void fly() {
		System.out.println("일반비행");
	}
}
class SuperAir extends Air{
	public static final int NORMAL =1;
	public static final int SUPER =2;
	public int flyMode =NORMAL;
	public void fly() {
		if(flyMode == SUPER) {
			System.out.println("초음속비행");
		}
		else {
			super.fly();
		}
	}
}
public class SupeAirEx {
	public static void main(String[] args) {
		SuperAir sa = new SuperAir();
		sa.flyMode =sa.NORMAL;
		sa.fly();
		sa.flyMode =sa.SUPER;
		sa.fly();
		sa.land();
	}

}