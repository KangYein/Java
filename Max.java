//import java.math.*;큰값 두 개 비교할 때
public class Max {

	public static void main(String[] args) {
		int x=5;
		int y=3;
		if(x>y){
			System.out.println("X가 크다");
		}
		else {
			System.out.println("Y가 크다");
		}
		System.out.println(x>y?"X가 크다":"Y가 크다");
	}

}