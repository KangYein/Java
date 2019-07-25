class Toy{
	int x;
	public Toy(int x) {
		this.x=x;
	}
	public String toString(){
		return "Toy("+x+")";
	}
}
public class ToStringMain {
	public static void main(String[] args) {
		Toy t = new Toy(5);
		System.out.println(t);
		System.out.println(t.toString());
		t.getClass();
	}//end of main
}//end