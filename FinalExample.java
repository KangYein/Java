import java.util.Scanner;

public class FinalExample {

	public static void main(String[] args) {
		final double PI =3.14159;
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요:");
		int radius =sc.nextInt();
		double circum = 2*radius*PI;
		double area = radius*radius*PI;
		System.out.println("원의 둘레는"+circum);
		System.out.println("원의 넓이는"+area);
		
		sc.close();
	}

}